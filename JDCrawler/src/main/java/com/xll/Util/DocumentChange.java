package com.xll.Util;

import us.codecraft.webmagic.selector.Selectable;

public class DocumentChange {

	public static String SelectorToSubString(Selectable selectable) {
		//<em class="tb-rmb-num">398.00</em>
		String string = selectable.toString();
		int end = string.lastIndexOf("<");
		int start = 0;
		for(int i=0; i<string.length();i++) {
			if(string.charAt(i)=='>') {
				start = i + 1;
				break;
			}
		}
		String newString = string.substring(start, end);
		
		return newString;
	}
	
	public static String StringToSubString(String string) {
		//<em class="tb-rmb-num">398.00</em>
		int end = string.lastIndexOf("<");
		int start = 0;
		for(int i=0; i<string.length();i++) {
			if(string.charAt(i)=='>') {
				start = i + 1;
				break;
			}
		}
		String newString = string.substring(start, end);
		
		return newString;
	}
}
