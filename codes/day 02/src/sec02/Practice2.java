package sec02;

import java.util.Scanner;

public class Practice2 {

	// 1259. 1부터 N까지 중 짝수의 합 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int sum = 0;

		System.out.print("최댓값을 입력하세요. >> ");

		double num;
		num = scan.nextDouble();

		int intNum = (int) num;

		for (int i = 1; i <= intNum / 2; i++) {
			sum = sum + 2 * i;
		}

		System.out.println("짝수의 합은 " + sum + "입니다.");
		scan.close();

	}

}
