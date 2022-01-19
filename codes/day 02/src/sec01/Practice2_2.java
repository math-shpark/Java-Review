package sec01;

import java.util.Arrays;
import java.util.Scanner;

public class Practice2_2 {

	// 1172. 수 정렬 - 배열 사용
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("정렬하고 싶은 정수 3개를 입력하세요. (띄어쓰기로 구분) >> ");

		boolean flag = true;

		while (flag) {

			String numbers = scan.nextLine();

			String[] eachNumbers = numbers.split("\\s");
			
			if (eachNumbers[0].equals("종료")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}

			int[] num = new int[eachNumbers.length];

			for (int i = 0; i < eachNumbers.length; i++) {
				num[i] = Integer.parseInt(eachNumbers[i]);
			}

			Arrays.sort(num);

			for (int j = 0; j < num.length; j++) {
				System.out.print(num[j] + "\t");
			}
			
			System.out.println("\n");
			System.out.print("새롭게 정렬할 숫자를 입력하거나 종료를 입력하여 프로그램을 종료하세요. >> ");

		}

		scan.close();
	}

}
