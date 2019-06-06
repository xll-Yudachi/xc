package com.xll.Util;

public class PriceRemoveMark {

	/**
	 * 1299.00-2450.00 -> 1299.00
	 * гд233.00 -> 233.00
	 * @param price
	 */
	public static String PriceRemoveMark(String price) {
		if(price.indexOf("-") > -1) {
			return price.substring(0, price.indexOf("-"));
		}else {
			if(price.indexOf("гд") > -1) {
				return price.substring(1);
			}
			return price;
		}
	}
}
