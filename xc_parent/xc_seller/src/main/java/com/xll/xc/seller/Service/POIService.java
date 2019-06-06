package com.xll.xc.seller.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

import javax.swing.filechooser.FileSystemView;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFCreationHelper;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.RichTextString;

import com.xll.xc.seller.Pojo.PayLog;

public class POIService {
	public static void DBToExcel(List<String> list) throws Exception{
		int length = list.size() / 5;
		//获取桌面路径
		FileSystemView fsv = FileSystemView.getFileSystemView();
		String desktop = fsv.getHomeDirectory().getPath();
		String filePath = desktop + "/电子对账单.xls";
		
		File file = new File(filePath);
		OutputStream outputStream = new FileOutputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("电子账单");
		//设置列的宽度
		sheet.setColumnWidth(0, 50*100);
		sheet.setColumnWidth(1, 50*100);
		sheet.setColumnWidth(2, 50*160);
		sheet.setColumnWidth(3, 50*100);
		sheet.setColumnWidth(4, 50*70);
		HSSFCellStyle fontCellStyle = workbook.createCellStyle();
		fontCellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		fontCellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		
		HSSFRow row = sheet.createRow(0);
		
		HSSFCell idCell = row.createCell(0);
		idCell.setCellStyle(fontCellStyle);
		idCell.setCellValue("支付订单号");
		
		HSSFCell orderCell = row.createCell(1);
		orderCell.setCellStyle(fontCellStyle);
		orderCell.setCellValue("下单时间");
		
		HSSFCell timeCell = row.createCell(2);
		timeCell.setCellStyle(fontCellStyle);
		timeCell.setCellValue("交易号");
		
		HSSFCell numCell = row.createCell(3);
		numCell.setCellStyle(fontCellStyle);
		numCell.setCellValue("商品订单号");
		
		HSSFCell priceCell = row.createCell(4);
		priceCell.setCellStyle(fontCellStyle);
		priceCell.setCellValue("订单金额");
		
		row.setHeightInPoints(30);
		
		for(int i=0;i<length;i++){
			HSSFRow rowTemp = sheet.createRow(i+1);
			
			rowTemp.createCell(0).setCellValue(list.get(5*i));
			
			//日期格式化
			HSSFCellStyle cellStyle = workbook.createCellStyle();
			HSSFCreationHelper creationHelper = workbook.getCreationHelper();
			cellStyle.setDataFormat(creationHelper.createDataFormat().getFormat("yyyy-MM-dd HH:mm:ss"));
			
			HSSFCell cell = rowTemp.createCell(1);
			cell.setCellStyle(cellStyle);
			cell.setCellValue(list.get(5*i+1));
			
			rowTemp.createCell(2).setCellValue(list.get(5*i+2));
			
			rowTemp.createCell(3).setCellValue(list.get(5*i+3));
			
			//保留两位小数
			HSSFCellStyle cellStyle2 = workbook.createCellStyle();
			cellStyle2.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00"));
			HSSFCell cell2 = rowTemp.createCell(4);
			cell2.setCellStyle(cellStyle2);
			cell2.setCellValue(list.get(5*i+4));
		}
		
			workbook.setActiveSheet(0);
			workbook.write(outputStream);
			outputStream.close();
		
		System.out.println("Excel表已完成！");
	}
}
