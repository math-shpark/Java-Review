package sec02;

import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		// LinkedList가 List 인터페이스의 규격에 맞춘 모듈이라 적용 가능
		List<String> list = new LinkedList<>();
		
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
		list.remove("홍길동");
		list.remove("김"); // 효과 없음
		
		System.out.println("데이터 삭제 결과 : " + list);
		
	}
	
}
