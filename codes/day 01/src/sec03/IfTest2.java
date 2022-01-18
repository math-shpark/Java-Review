package sec03;

public class IfTest2 {

	// 다중 if문 실습 - 점수에 따른 등급 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 93;

		if (score >= 97) {
			System.out.println("Grade : A+");
		} else if (score >= 95) {
			System.out.println("Grade : A");
		} else if (score >= 93) {
			System.out.println("Grade : A-");
		} else if (score >= 90) {
			System.out.println("Grade : B+");
		} else {
			System.out.println("Grade : B");
		}

	}

}
