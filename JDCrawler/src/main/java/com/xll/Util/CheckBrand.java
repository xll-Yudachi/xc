package com.xll.Util;

public class CheckBrand {
		/**
		 * ��spec����ȡ��Ʒ����Ϣ
		 * @param spec
		 * @return
		 */
		//[Ʒ��: ���л���, ��������: 18-25����, ����: ����, ����: XS S M L XL, ��ɫ����: ������һ��-4��30�շ��� ����ȹһ��-4��30�շ��� ����ȹһ��-5��10�շ��� ������һ��-5��10�շ��� ����ȹһ��-5��20�շ��� ������һ��-5��20�շ���, ����: HJL157, �ɷֺ���: 96%������, ������ݼ���: 2017�궬��]
		public static String CheckBrand(String spec) {
			String result = null;
			String[] strings = spec.split(",");
			for(String temp : strings) {
				if(temp.contains("Ʒ��")) {
					result = temp.substring(temp.indexOf(":")+1).trim();
					break;
				}
			}
			return result;
		}
}
