package sec02;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

//		List<String> list = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();

		list.add("홍길동");
		list.add("홍길동");
		list.add("김철수");
		list.add("이유리");

		System.out.println("초기 배열 상태 : " + list);

		// 중간에 끼워넣기
		list.add(0, "강호동");
		System.out.println("원하는 인덱스에 데이터를 추가한 결과 : " + list);

		// 원하는 인덱스 번호의 데이터 삭제
		list.remove(0);

		// 내용이 일치하면 데이터 삭제(equals 메소드 활용)
		list.remove("홍길동"); // 앞의 홍길동만 삭제되고 인덱스가 하나씩 당겨짐
		list.remove("김"); // 효과 없음

		System.out.println("데이터 삭제 결과 : " + list);

		// 연속된 동일한 데이터를 삭제하기 위해 for 반복문 사용 시 인덱스 유의
		// 아래의 반복문의 경우 위의 홍길동 삭제 라인 주석 처리 시 두번째 홍길동이 삭제되지 않음
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).equals("홍길동")) {
//				list.remove(i);
//			}
//		}

	}

}
