package util;

import java.util.ArrayList;
import java.util.List;

public class ImagesUtil {
	
	/**
	 * Title : ImagesStringToList
	 * Description : 将多个图像地址字符串转换为集合
	 * CreateDate : 2019年5月30日 下午3:16:47
	 * Author : Yudachi
	 * @param images
	 * @return
	 * List<String>
	 * @throws
	 */
	public static List<String> ImagesStringToList(String images) {
		String temp = images.substring(1, images.length()-1);
		String[] image = temp.split(",");
		List<String> list = new ArrayList<>();
		for(String s:image) {
			list.add(s);
		}
		return list;
	}
}
