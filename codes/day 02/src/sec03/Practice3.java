package sec03;

import java.util.Scanner;

public class Practice3 {

	// 1355. 삼각형 출력 3
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("삼각형의 크기를 정하세요. >> ");

		int star = scan.nextInt();

		for (int i = star; i > 0; i--) {
			for (int j = 1; j <= star - i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		scan.close();
	}

}
