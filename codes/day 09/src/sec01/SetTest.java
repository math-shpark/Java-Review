package sec01;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		// 데이터 추가
		set.add("해쉬브라운");
		set.add("돈까스");
		set.add("싸이버거");
		set.add("해쉬브라운");

		// 데이터 확인
		for (String food : set) {
			System.out.println(food); // 출력 순서는 해쉬코드 순이라 순서를 알지 못함
		}

		// 내용 초기화
//		set.clear();

		// set을 배열로
		String[] str = set.toArray(new String[set.size()]);
		System.out.println(str.toString());

		// Person 타입의 Set 객체 생성
		Set<Person> pset = new HashSet<>();

		Person person1 = new Person("홍길동", 24);
		Person person2 = new Person("김철수", 36);
		Person person3 = new Person("홍길동", 24);

		// 데이터 입력
		pset.add(person1);
		pset.add(person2);
		pset.add(person3); // 다른 객체를 참조하기 때문에 다른 데이터임

		for (Person p : pset) {
			System.out.println(p);
		}

	}

}
