package com.xll.Util;

public class CheckBrand {
		/**
		 * 从spec中提取出品牌信息
		 * @param spec
		 * @return
		 */
		//[品牌: 汉尚华莲, 适用年龄: 18-25周岁, 材质: 涤纶, 尺码: XS S M L XL, 颜色分类: 仅上襦一件-4月30日发货 仅下裙一件-4月30日发货 仅下裙一件-5月10日发货 仅上襦一件-5月10日发货 仅下裙一件-5月20日发货 仅上襦一件-5月20日发货, 货号: HJL157, 成分含量: 96%及以上, 上市年份季节: 2017年冬季]
		public static String CheckBrand(String spec) {
			String result = null;
			String[] strings = spec.split(",");
			for(String temp : strings) {
				if(temp.contains("品牌")) {
					result = temp.substring(temp.indexOf(":")+1).trim();
					break;
				}
			}
			return result;
		}
}
