package sec03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import sec02.Student;

public class ComparableTest {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student(1, "홍길동"));
		list.add(new Student(2, "김철수"));
		list.add(new Student(3, "이유리"));
		list.add(new Student(4, "박지성"));

		Collections.sort(list);
		
		for(Student s : list) {
			System.out.println(s);
		}
	}

}
