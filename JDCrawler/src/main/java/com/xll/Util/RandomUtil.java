package com.xll.Util;

import java.util.Random;

/**
 * 随机数产生类
 */
public class RandomUtil {
	public static String getRandom(int length){
		String val = "";
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			val += String.valueOf(random.nextInt(10));
		}
		return val;
	}
}
