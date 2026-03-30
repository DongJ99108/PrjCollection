package collection2;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Java");
		set.add("Html");
		set.add("Oracle");
		set.add("Java"); // j 를 J로 바꾸면 중복이 적용되지않는 set 특성상 인식이 안됨
		set.add("Spring");
		System.out.println(set.size()); // 4
		System.out.println(set);
		
		// 일반적인 for 문으로는 하나하나씩 집어올 수 없다. 대신 전용 함수인 iterator로 대체할 수 있다.
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.print(name + " ");
		}
		System.out.println();
		

	}

}
