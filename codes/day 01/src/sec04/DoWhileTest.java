package sec04;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int inputNum;

		do {
			System.out.println("숫자를 입력하세요 >> ");
			inputNum = scanner.nextInt();
			System.out.println("입력한 숫자 : " + inputNum);
		} while (inputNum <= 5);

		System.out.println("입력한 숫자가 " + inputNum + "으로 5보다 큽니다.");
		System.out.println("프로그램 종료");

		scanner.close();

	}

}
