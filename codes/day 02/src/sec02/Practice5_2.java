package sec02;

import java.util.Scanner;

public class Practice5_2 {

	// 1278. 자리수 계산
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자를 입력하세요. >> ");
		String num = scan.next();

		String[] eachNum = num.split("");

		System.out.println(eachNum.length);

		scan.close();
	}

}
