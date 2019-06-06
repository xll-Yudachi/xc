package util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import entity.TotalResult;


public class LinkedHashMapToList {
	public static List LinkedHashMapToList(String str){
		List<String> listString = new ArrayList<>();
		List<TotalResult> list = new ArrayList<>();
		str = str.substring(1, str.length()-1);
		String[] temp1 = str.split(",");
		for(String s : temp1) {
			s = s.trim();
			if(s.startsWith("{")) {
				s=s.substring(1);
			}
			if(s.endsWith("}")) {
				s=s.substring(0, s.length()-1);
			}
			s = s.substring(s.indexOf("=")+1).trim();
			
			listString.add(s);
		}
		for(int i=0;i<listString.size()/8;i++) {
			TotalResult totalResult = new TotalResult();
			totalResult.setId(listString.get(8*i));
			totalResult.setTitle(listString.get(8*i+1));
			totalResult.setPrice(new BigDecimal(listString.get(8*i+2)));
			totalResult.setTotalFee(new BigDecimal(listString.get(8*i+3)));
			totalResult.setTotalMoney(new BigDecimal(listString.get(8*i+4)));
			totalResult.setNum(new Integer(listString.get(8*i+5)));
			totalResult.setImage(listString.get(8*i+6));
			totalResult.setSellerid(listString.get(8*i+7));
			list.add(totalResult);
		}
		return list; 
	}
}
