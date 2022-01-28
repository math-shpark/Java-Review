package sec02;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("홍길동");
		set.add("김철수");
		set.add("이유리");

		System.out.println(set);

		Set<Student> std = new HashSet<>();

		std.add(new Student(1, "홍길동"));
		std.add(new Student(1, "김철수"));

		System.out.println(std);

	}

}
