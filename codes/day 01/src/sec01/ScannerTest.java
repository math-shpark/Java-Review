package sec01;

import java.util.Scanner;

public class ScannerTest {

	// Scanner 실습
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// 논리형
//		boolean flag = scanner.nextBoolean();

		// char은 사용 안됨

		// 정수형
//		short num = scanner.nextShort();
		int age = scanner.nextInt();
//		long money = scanner.nextLong();

		// 실수형
//		float fnum = scanner.nextFloat();
//		double dnum = scanner.nextDouble();

		// 문자열
//		String name = scanner.next();

		// 문자 하나만 입력받고 싶은 경우
//		char c = scanner.next().charAt(0);

		System.out.println("입력하신 나이는 " + age + "살 입니다.");

		scanner.close();

	}

}
