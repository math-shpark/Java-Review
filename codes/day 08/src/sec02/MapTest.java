package sec02;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("홍길동", "010-1234-5678");
		map.put("김철수", "010-1234-5678"); // 값은 중복되어도 상관없음
		map.put("홍길동", "010-1111-1111"); // 키가 중복되면 나중에 선언된 값으로 저장됨

		System.out.println(map);
		System.out.println(map.get("홍길동")); // 배열의 인덱스 역할을 맵에서 키가 수행
	}

}
