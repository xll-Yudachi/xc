package com.xll.JD;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.Flushable;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.xll.Util.RandomUtil;
import com.xll.Util.RemoveNBSP;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.xll.Util.CheckBrand;
import com.xll.Util.DocumentChange;
import com.xll.Util.JDIntroduct;
import com.xll.Util.JDSKU;
import com.xll.Util.PriceRemoveMark;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.selenium.SeleniumDownloader;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.pipeline.FilePipeline;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * 爬取类
 */
public class ImportItem implements PageProcessor {

	public void process(Page page) {

		String title;
		if(page.getHtml().xpath("//*[@class=\"sku-name\"]/text()") == null) {
			title = null;
		}else {
			title = page.getHtml().xpath("//*[@class=\"sku-name\"]/text()").toString();
		}
		
		Double price;
		if (page.getHtml().xpath("//*[@class=\"price\"]/text()") == null) {
			price = null;
		} else {
			try {
				price = Double.valueOf(PriceRemoveMark.PriceRemoveMark(page.getHtml().xpath("//*[@class=\"price\"]/text()").toString()));
			} catch (Exception e) {
				price = null;
			}
		}
		
		String shopname;
		if(page.getHtml().xpath("//*[@id=\"crumb-wrap\"]/div/div[2]/div[2]/div[1]/div/a/text()") == null) {
			shopname = null;
		}else {
			shopname = page.getHtml().xpath("//*[@id=\"crumb-wrap\"]/div/div[2]/div[2]/div[1]/div/a/text()").toString();
		}
		
		Integer num;
		if (page.getHtml().xpath("//*[@id=\"J_isku\"]/div/dl[3]/dd/em/span/text()").toString() == null) {
			num = Integer.valueOf(RandomUtil.getRandom(4));
		} else {
			try {
				num = Integer.valueOf(page.getHtml().xpath("//*[@id=\"J_isku\"]/div/dl[3]/dd/em/span/text()").toString());
			} catch (Exception e) {
				num = 0;
			}
		}
		
		String sell_point;
		if(page.getHtml().xpath("//*[@id=\"p-ad\"]/text()")==null) {
			sell_point = null;
		}else {
			sell_point = page.getHtml().xpath("//*[@id=\"p-ad\"]/text()").toString();
		}
		
		String image ;
		if(page.getHtml().xpath("//*[@id=\"spec-list\"]/ul/li/img/@src")==null) {
			image = null;
		}else {
		    image = page.getHtml().xpath("//*[@id=\"spec-list\"]/ul/li/img/@src").all().toString();
		}
		
		String content;
		List<String> contentList = new ArrayList<String>();
		List<String> listdt = page.getHtml().xpath("//*[@class=\"li p-choose\"]/div[1]/text()").all();
		List<String> listdd = page.getHtml().xpath("//*[@class=\"li p-choose\"]/div[2]").all();
		if(page.getHtml().xpath("//*[@id=\"detail\"]/div[2]/div[1]/div[1]/ul[2]/li/text()") == null) {
			content = null;
		}else {
			contentList = page.getHtml().xpath("//*[@id=\"detail\"]/div[2]/div[1]/div[1]/ul[2]/li/text()").all();
			for(int i=0;i<listdt.size();i++) {
				contentList.add( listdt.get(i) + "：" + JDSKU.chooseitem(listdd.get(i)));
			}
			content = RemoveNBSP.RemoveNBSP(contentList.toString());
		}
		
		String bigImage;
		if(page.getHtml().xpath("//*[@id=\"spec-img\"]/@src")==null) {
			bigImage = null;
		}else {
			bigImage = page.getHtml().xpath("//*[@id=\"spec-img\"]/@src").toString();
		}
		
		String introduction;
		if(page.getHtml().xpath("//*[@id=\"J-detail-content\"]")==null) {
			introduction = null;
		}else {
			introduction = JDIntroduct.AddHttps(page.getHtml().xpath("//*[@id=\"J-detail-content\"]").toString().trim());
		}
		
		String package_list = "精美包装";
		String sale_service = "在确认收货 15 天内，如有商品质量问题、描述不符或未收到货等，您有权申请退款或退货，来回邮费由卖家承担。";
		
		Double preferentialprice;
		if (page.getHtml().xpath("/html/body/div[8]/div/div[2]/div[3]/div/div[1]/div[2]/div[1]/span[1]/span/text()") == null) {
			preferentialprice = null;
		} else {
			try {
				preferentialprice = Double.valueOf(PriceRemoveMark.PriceRemoveMark(page.getHtml().xpath("/html/body/div[8]/div/div[2]/div[3]/div/div[1]/div[2]/div[1]/span[1]/span/text()").toString()));
			} catch (Exception e) {
				preferentialprice = null;
			}
		}
		
		String brand;
		if(page.getHtml().xpath("//*[@id=\"parameter-brand\"]/li/a/text()")==null) {
			brand = null;
		}else {
			brand = page.getHtml().xpath("//*[@id=\"parameter-brand\"]/li/a/text()").toString();
		}
	
				
		// 声明Connection对象
				Connection con;
				// 驱动程序名
				String driver = "com.mysql.jdbc.Driver";
				// URL指向要访问的数据库名mydata
				String url = "jdbc:mysql://192.168.80.131:3306/xc?characterEncoding=UTF-8";
				// MySQL配置时的用户名
				String user = "root";
				// MySQL配置时的密码
				String password = "ZUIEWANGGUAN";
				// 遍历查询结果集
				try {
					// 加载驱动程序
					Class.forName(driver);
					// 1.getConnection()方法，连接MySQL数据库！！
					con = (Connection) DriverManager.getConnection(url, user, password);
					String sql = "insert into tb_goods (seller_id,goods_name,audit_status,is_marketable,caption,category1_id,category2_id,small_pic,price,is_delete,preferentialprice) values(?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
					if(shopname == null) {
						pst.setNull(1, Types.VARCHAR);
					}else {
						pst.setString(1, shopname);
					}
					if(title == null) {
						pst.setNull(2, Types.VARCHAR);
					}else {
						pst.setString(2, title.trim());
					}
					pst.setString(3, "1");
					pst.setString(4, "1");
					if(sell_point == null) {
						pst.setNull(5, Types.VARCHAR);
					}else {
						pst.setString(5, sell_point);
					}
					
					
					
					pst.setLong(6, 27);
					pst.setLong(7, 790);
					
					
					
					if(image == null) {
						pst.setNull(8, Types.VARCHAR);
					}else {
						pst.setString(8, image);
					}
					if (price == null) {
						pst.setDouble(9, 9999);
					} else {
						pst.setDouble(9, price);
					}
					pst.setString(10, "0");
					if (preferentialprice == null) {
						pst.setNull(11, Types.DECIMAL);
					} else {
						pst.setDouble(11, preferentialprice);
					}
					pst.executeUpdate();

					ResultSet rs = pst.getGeneratedKeys();
					Long id = 0L;
					if (rs.next()) {
						id = rs.getLong(1);
					}

					String sql2 = "insert into tb_goods_desc (goods_id,introduction,specification_items,item_images,package_list,sale_service) values(?,?,?,?,?,?)";
					PreparedStatement pst2 = (PreparedStatement) con.prepareStatement(sql2);

					pst2.setLong(1, id);
					if(introduction == null) {
						pst2.setNull(2, Types.VARCHAR);
					}else {
						pst2.setString(2, introduction.trim());
					}
					if(content == null) {
						pst2.setNull(3, Types.VARCHAR);
					}else {
						pst2.setString(3, content);
					}
					if(bigImage == null) {
						pst2.setNull(4, Types.VARCHAR);
					}else {
						pst2.setString(4, bigImage);
					}
					pst2.setString(5, package_list);
					pst2.setString(6, sale_service);

					pst2.executeUpdate();

					String sql3 = "insert into tb_item (title,sell_point,price,num,image,categoryId,status,create_time,update_time,cost_pirce,market_price,is_default,goods_id,seller_id,category,brand,spec,seller) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst3 = (PreparedStatement) con.prepareStatement(sql3);
					if(title == null) {
						pst3.setNull(1, Types.VARCHAR);
					}else {
						pst3.setString(1, title.trim());
					}
					if(sell_point == null) {
						pst3.setNull(2, Types.VARCHAR);
					}else {
						pst3.setString(2, sell_point);
					}
					if(price == null) {
						pst3.setDouble(3, 9999);
					}else {
						pst3.setDouble(3, price);
					}
					if(num == null) {
						pst3.setNull(4, Types.INTEGER);
					}else {
						pst3.setInt(4, num);
					}
					if(bigImage == null) {
						pst3.setNull(5, Types.VARCHAR);
					}else {
						pst3.setString(5, bigImage);
					}
					
					
					
					
					pst3.setLong(6, 790);
					
					
					
					
					
					pst3.setString(7, "1");
					pst3.setDate(8, new Date(System.currentTimeMillis()));
					pst3.setDate(9, new Date(System.currentTimeMillis()));
					if(preferentialprice == null) {
						pst3.setNull(10, Types.DECIMAL);
						pst3.setNull(11, Types.DECIMAL);
					}else {
						pst3.setDouble(10, preferentialprice);
						pst3.setDouble(11, preferentialprice);
					}
					pst3.setString(12, "1");
					pst3.setLong(13, id);
					if(shopname == null) {
						pst3.setNull(14, Types.VARCHAR);
						pst3.setNull(18, Types.VARCHAR);
					}else {
						pst3.setString(14, shopname);
						pst3.setString(18, shopname);
					}
					
					
					
					
					pst3.setString(15, "山核桃");
					
					
					
					
					if(brand == null) {
						pst3.setNull(16, Types.VARCHAR);
					}else {
						pst3.setString(16, brand);
					}
					if(content == null) {
						pst3.setNull(17, Types.VARCHAR);
					} else {
						pst3.setString(17, content);
					}
					
					
					
					pst3.executeUpdate();
				} catch (ClassNotFoundException e) {
					// 数据库驱动类异常处理
					System.out.println("Sorry,can`t find the Driver!");
					e.printStackTrace();
				} catch (SQLException e) {
					// 数据库连接失败异常处理
					e.printStackTrace();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				} finally {
					System.out.println("数据库数据存储获取！！");
				}
	}
	

	public Site getSite() {
		return Site.me().setSleepTime(100).setRetrySleepTime(3);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
				new FileReader(new File("E:\\课设\\JDCrawler\\src\\main\\java\\com\\xll\\JD\\JDItem.txt")));
		List<String> list = new ArrayList<String>();
		String temp = null;
		while ((temp = br.readLine()) != null) {
			list.add(temp);
		}
		System.setProperty("selenuim_config", "E:\\课设\\JDCrawler\\src\\main\\java\\com\\xll\\Config\\config.ini");
		Spider.create(new ImportItem())
				.addUrl(list.toArray(new String[list.size()]))
				.setDownloader(new SeleniumDownloader(
						"C:\\Program Files (x86)\\Google\\ChromeDriver\\chromedriver.exe")
								.setSleepTime(10000))
				.addPipeline(new ConsolePipeline()).addPipeline(new FilePipeline("d:\\webmagic"))
				.run();

	}
}
