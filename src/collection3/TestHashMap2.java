package collection3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "인사");
		map.put(20, "자재");
		map.put(30, "연구개발");
		map.put(40, "총무");
		map.put(50, "생산");
		
		System.out.println(map);
		System.out.println(map.get(30)); // 스위치나 if 문보다 간편
		System.out.println(map.size());
		
		map.put(70,  "기획");
		map.put(10,  "김선태"); // 똑같은 key 를 가지고 중복입력하면 값이 바뀜 - Map<key, 값>
		System.out.println(map);
		System.out.println(map.get(10)); // 스위치나 if 문보다 간편
		System.out.println(map.size());
		
		System.out.println("==========================================================");
		System.out.println("1.");
		// 모두 출력 1.
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + ":" + val);
		}
		System.out.println("==========================================================");
		System.out.println("2.");
		
		
		// 모두 출력 2.
		// 1. 키목록 : set keySet()
		Set<Integer> keySet = map.keySet();
		for (Iterator iterator = keySet.iterator(); iterator.hasNext();) {
			Integer key = (Integer) iterator.next();
			System.out.println(key + ":" + map.get(key));
		}
		
		
		// 모두 출력 3.
		// MapEntry
		
		
		
		
		
		
		
		
		
		

	}

}











































