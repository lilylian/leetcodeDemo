package com.lilylian.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * 609. Find Duplicate File in System
 * 在系统中查询重复文件
 */
public class String171123_609findDuplicate {
	
	/**
	 * My answer
	 */
    public static List<List<String>> findDuplicate(String[] paths) {
    	Map<String, String> map = new HashMap<String, String>();
    	Map<String, List<String>> listMap = new HashMap<String, List<String>>();
    	for (int i = 0, len = paths.length; i < len; i++) {
    		find(paths[i], map, listMap);
    	}
    	return new ArrayList<List<String>>(listMap.values());
    }
    
	public static void find(String path, Map<String, String> map, Map<String, List<String>> listMap) {
		String[] split = path.split(" ");
		String dir = split[0];
		for (int i = 1; i < split.length; i++) {
			String[] split2 = split[i].split("\\(|\\)");
			String fileName = split2[0];
			String content = split2[1];
			if(map.containsKey(content) && listMap.containsKey(content)){
				listMap.get(content).add(dir+"/"+fileName);
				continue;
			} 
			if(map.containsKey(content)){
				List<String> list = new ArrayList<String>();
				list.add(map.get(content));
				list.add(dir+"/"+fileName);
				listMap.put(content, list);
				continue;
			}
			map.put(content, dir+"/"+fileName);
		}
	}
	/**
	 * leetcode's answer
	 */
	public static List<List<String>> findDuplicate2(String[] paths) {
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		for (int i = 0; i < paths.length; i++) {
			String[] valus = paths[i].split(" ");
			for (int j = 1; j < valus.length; j++) {
				String[] name_con = valus[j].split("\\(|\\)");
				List<String> list = map.get(name_con[1]);
				if(list == null) list = new ArrayList<String>();
				list.add(valus[0]+"/"+name_con[0]);
				map.put(name_con[1], list);
			}
			
		}
		List<List<String>> list = new ArrayList<List<String>>();
		for(String s : map.keySet()){
			if(map.get(s).size()>1) list.add(map.get(s));
		}
		return list;
    }
	
	


	public static void main(String[] args) {
		String[] s = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
		System.out.println(findDuplicate(s));
		System.out.println(findDuplicate2(s));
//		System.out.println(findDuplicate(s));
	}
}
