package sec01;

import java.util.Scanner;

public class Practice2_1 {

	// 1172. 수 정렬 - 조건문 사용
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("정렬하고 싶은 숫자 3개를 입력하세요. (띄어쓰기로 구분) >> ");

		boolean flag = true;

		while (flag) {

			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int num3 = scan.nextInt();

			if (num1 == num2 && num2 == num3) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}

			// 작은 숫자를 앞에 오게 하여 출력하는 선택 정렬 로직
			if (num1 > num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}

			if (num2 > num3) {
				if (num3 > num1) {
					int temp = num2;
					num2 = num3;
					num3 = temp;
				} else {
					int temp = num1;
					num1 = num3;
					num3 = num2;
					num2 = temp;
				}
			}

			System.out.printf("오름차순 정렬 결과 : %d %d %d \n", num1, num2, num3);
			System.out.println("");
			System.out.print("새로 정렬할 숫자 3개를 입력하거나 같은 숫자 3개를 입력하여 프로그램을 종료하세요. >> ");

		}

		scan.close();
	}

}
