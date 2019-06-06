package com.xll.Util;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

public class RemoveNBSP {

	public static String RemoveNBSP(String string) {
		try {
			return new String(string.getBytes(),"GBK").replace('?', ' ').replace('¡¡', ' ');
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
}
