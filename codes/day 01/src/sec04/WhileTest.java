package sec04;

public class WhileTest {

	// while 문 실습
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		while (n < 10) {
			System.out.println(n);

			n++; // 이 문장이 없다면 무한 반복될 것
		}

		System.out.println("");
		System.out.println(n);

	}

}
