package sec03;

import java.util.Scanner;

public class Practice1 {

	// 1353. 삼각형 출력 1
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("삼각형의 크기를 정하세요. >> ");

		int star = scan.nextInt();

		for (int i = 1; i <= star; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		scan.close();
	}

}
