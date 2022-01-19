package sec02;

import java.util.Scanner;

public class Practice4 {

	// 1274. 소수 판별
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("[ 소수 판별 프로그램 ]");
		System.out.print("소수인지 판별할 2 이상의 자연수를 입력하세요. >> ");

		boolean end = false; // 0을 입력하면 반복문 실행 안함

		while (!end) {

			int num = scan.nextInt(); // 입력한 숫자 가져오기

			boolean flag = false;

			if (num == 0) {
				System.out.println("프로그램이 종료되었습니다.");
				end = true;
				continue;
			} else if (num == 2) {
				flag = false; // 2는 소수
			} else {
				for (int i = 2; i <= Math.sqrt(num); i++) {
					if (num % i == 0) {
						flag = true; // 소수이면 true 반환
					}
				}
			}

			if (flag) {
				System.out.println("소수가 아닙니다.");
			} else {
				System.out.println("소수입니다.");
			}

			System.out.println(""); // 1줄 간격
			System.out.println("소수인지 판별할 다른 숫자를 입력하거나 0을 입력하여 프로그램을 종료하세요.");
			System.out.print("소수인지 판별할 숫자 : ");
		}

		scan.close();

	}

}
