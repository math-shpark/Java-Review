package sec02;

import java.util.Scanner;

public class Practice5_1 {

	// 1278. 자리수 계산
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자를 입력하세요. >> ");

		int num = scan.nextInt();
		int i = 1;

		while (true) {
			num = num / 10;

			if (num == 0) {
				System.out.println(i);
				break;
			} else {
				i++;
			}
		}

		scan.close();
	}

}
