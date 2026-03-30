package collection2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

class Student {
	private int id;
	private String name;
	
	public Student(int id, String name) {
		// super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stundent [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
}

public class TestSetStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> studList = new ArrayList<>();
		
		// Student s1 = newStudent(1, "가나");
		studList.add( new Student(1, "가나") );
		studList.add( new Student(2, "나나") );
		studList.add( new Student(3, "다나") );
		studList.add( new Student(1, "가나") );
		System.out.println(studList);
		System.out.println(studList.size());
		System.out.println("==========================================");
		
		//---------------------------------------------------
		HashSet<Student> studSet = new HashSet<>();
		
		studSet.add( new Student(1, "가나") );
		studSet.add( new Student(2, "나나") );
		studSet.add( new Student(3, "다나") );
		studSet.add( new Student(1, "가나") );
		System.out.println(studSet);
		System.out.println(studSet.size()); // new 가 들어가면 hash 코드는 새로나온다 그래서 equals 로 재정의 해줘야 갯수가 맞게 찍힌다.
		System.out.println("==========================================");

		TreeSet<Student> studSet2 = new TreeSet<>();
		
		studSet2.add( new Student(1, "가나") );
		studSet2.add( new Student(2, "나나") );
		studSet2.add( new Student(3, "다나") );
		studSet2.add( new Student(1, "가나") );
		System.out.println(studSet2);
		System.out.println(studSet2.size());
		System.out.println("==========================================");

	}

}
