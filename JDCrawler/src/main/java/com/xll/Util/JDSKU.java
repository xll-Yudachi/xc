package com.xll.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JDSKU {
	//data-value="XL" -> XL
	public static String choosevalue(String value) {
		int start = value.indexOf("\"");
		int end = value.lastIndexOf("\"");
		return value.substring(start+1, end);
	}
	
	//查询指定属性对应的值
	public static String chooseitem(String str) {
			String result = "";
			Pattern p=Pattern.compile("data-value=\\\".*\\\"\\ ");
		    Matcher m=p.matcher(str);
		    while(m.find()){
		    	result += choosevalue(m.group(0)) + "，";
		    }
		    return result.substring(0, result.length()-1);
	}
}
