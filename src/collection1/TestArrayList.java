package collection1;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {

	public static void main(String[] args) {
		int [] arr = new int[3]; // 초기값이 없으니 int[] 안에 3 집어넣기
		arr[0] =10;
		arr[1] =20;
		arr[2] =30;
		// arr[3] =40; // ArrayIndexOutOfBoundsException
		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i] + " " );
		}
		System.out.println();
		//------------------------------
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add( 10 );
		numList.add( 20 );
		numList.add( 30 );
		numList.add( 40 );
		numList.add( 50 );
		
		for (int i = 0; i < numList.size(); i++) {
			System.out.print(numList.get(i) + " " );
		}
		System.out.println();
			
		numList.add(100);
		numList.add(35);
		for (Integer num : numList) {
			System.out.print(num + " " );
		}
			
		System.out.println();
		
		Collections.sort( numList, (a, b) -> a-b );
		System.out.println(numList);
		Collections.sort( numList, (a, b) -> b-a );
		System.out.println(numList);
	}

}
