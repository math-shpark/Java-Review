package sec03;

public class IfTest1 {

	// 단일 if문 실습 - 조건에 따른 값 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;

		if (a < 10) {
			System.out.println(a + "는 10보다 작은 수이다.");
		}

		String name = "홍길동";
		int age = 25;

		if (age < 20) {
			System.out.println(name + "은 미성년자입니다.");
		} else {
			System.out.println(name + "은 성인입니다.");
		}

	}

}
