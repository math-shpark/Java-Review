package sec02;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<>();

		// 데이터 추가
		name.add("김철수"); // add(Object)
		name.add("홍길동");
		name.add("유재석");

		// 데이터 조회
		name.get(0);

		// 리스트 크기
		name.size();

		// 데이터 삭제
		name.remove(0); // remove(index) - 인덱스 번호로 삭제
		name.remove("홍길동"); // remove(Object) - 같은 데이터 삭제

		// 데이터 수정
		name.set(0, "강호동"); // set(index, Object) - 해당 인덱스 번호의 데이터 수정

		// 부분 리스트
		name.subList(2, 4); // subList(fromIndex, toIndex) - 시작 인덱스부터 종료 인덱스 전의 인덱스의 데이터까지 부분 추출
	}

}
