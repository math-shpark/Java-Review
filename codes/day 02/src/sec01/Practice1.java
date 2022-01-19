package sec01;

import java.util.Scanner;

public class Practice1 {

	// 1166. 윤년 판별
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		// 무한 반복
		boolean flag = true;

		// 초기 메시지
		System.out.print("윤년을 판별하고 싶은 연도를 입력하세요. >> ");

		while (flag) {

			int year = scan.nextInt(); // 입력한 연도 가져오기

			// 0을 입력하면 무한반복 종료
			if (year == 0) {
				System.out.println("윤년 계산 프로그램이 종료되었습니다.");
				flag = false;
				continue; // break 사용 가능
			}

			// 윤년인지 판별하는 로직
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("입력하신 연도인 " + year + "년은 윤년입니다.");
			} else {
				System.out.println("입력하신 연도인 " + year + "년은 평년입니다.");
			}

			// 새로 입력하는 연도 간격 띄우기
			System.out.println("");
			System.out.print("계속하고 싶으시면 다른 연도를 입력하시고 종료하고 싶으시면 0을 입력하세요. >> ");

		}

		// 입력 종료
		scan.close();

	}

}
