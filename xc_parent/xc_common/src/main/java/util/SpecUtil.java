package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpecUtil {
	public static List<String> SpecStringToList(String spec){
		List<String> list = new ArrayList<>();
		String temp = spec.substring(1, spec.length()-1);
		
		String[] specs = temp.split(",");
		for(String s : specs) {
			list.add(s);
		}
		return list;
	}
	
	public static Map<String, List<String>> ChooseSpec(List<String> list){
		Map map = new HashMap<>();
		
		System.err.println("list:" + list.toString());
		
		for(int i=0; i<list.size();i++) {
			List<String> result = new ArrayList<>();
			if(list.get(i).split(" ").length > 3) {
				
				String[] temp_1 = list.get(i).split(":");
				System.err.println("temp_1: " + temp_1.toString());
				
				
				String[] temp_2 = temp_1[1].split(" ");
				
				Collections.addAll(result, temp_2);
				
				map.put(temp_1[0], result);
				
			}
		}
		return map;
	}
}
