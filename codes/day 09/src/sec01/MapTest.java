package sec01;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		// 데이터 입력
		map.put("홍길동", "낚시");
		map.put("홍길동", "운전"); // 데이터가 최신화됨
		
		// 데이터 출력
		System.out.println(map.get("홍길동"));
		
	}
	
}
