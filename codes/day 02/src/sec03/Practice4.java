package sec03;

import java.util.Scanner;

public class Practice4 {

	// 1380. 두 주사위의 합
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("두 주사위를 던져서 나온 숫자의 합을 입력하세요. >> ");

		int sum = scan.nextInt();

		for (int i = 1; i < 7; i++) {
			if ((sum - i) <= 6 && (sum - i) >= 1) {
				System.out.println(i + " " + (sum - i));
			}
		}

		scan.close();
	}

}
