package sec01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest {

	public static void main(String[] args) {

		// 리스트 객체 생성
		List<Person> personList = new ArrayList<>();

		// 데이터 입력
		personList.add(new Person("홍길동", 26));
		personList.add(new Person("김철수", 39));
		personList.add(new Person("이유리", 26));
		personList.add(new Person("박지성", 15));

		// 데이터 출력
		// 입력한 순서로 출력
		for (Person p : personList) {
			System.out.println(p);
		}

		System.out.println();

		// 데이터 정렬(comparable)
		Collections.sort(personList);

		// 정렬한 순서로 출력
		for (Person p : personList) {
			System.out.println(p);
		}

		System.out.println();

		// 데이터 정렬(comparator)
		Collections.sort(personList, new AgeComparator());

		// 정렬한 순서로 출력
		for (Person p : personList) {
			System.out.println(p);
		}

		System.out.println();

		// 데이터 정렬(anonymous inner class)
		Collections.sort(personList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				if (o1.age == o2.age) {
					return o1.name.compareTo(o2.name);
				}

				return Integer.compare(o1.age, o2.age);
			}
		});

		// 정렬한 순서로 출력
		for (Person p : personList) {
			System.out.println(p);
		}

	}

}
