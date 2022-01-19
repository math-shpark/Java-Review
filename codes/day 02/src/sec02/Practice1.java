package sec02;

import java.util.Scanner;

public class Practice1 {

	// 1257. 두 수 사이의 홀수 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("홀수를 출력할 숫자의 범위를 설정하세요");
		System.out.println("(0보다 크거나 같은 수를 입력해야 함, 실수 입력 가능)");
		System.out.print("최솟값 : ");

		double min = scan.nextDouble();

		int intMin;

		if (min % 1 == 0) {
			intMin = (int) min;
		} else {
			intMin = (int) min + 1;
		}

		System.out.print("최댓값 : ");

		double max = scan.nextDouble();

		int intMax = (int) max;

		if ((intMax - intMin) < 1) {
			System.out.println("홀수가 없습니다.");
		} else {
			if (intMin % 2 == 0 && intMax % 2 == 0) {
				for (int i = 0; i < (intMax - intMin) / 2; i++) {
					System.out.print(intMin + 1 + 2 * i + "\t");
				}
			} else if (intMin % 2 == 0 && intMax % 2 != 0) {
				for (int i = 0; i <= (intMax - intMin) / 2; i++) {
					System.out.print(intMin + 1 + 2 * i + "\t");
				}
			} else {
				for (int i = 0; i <= (intMax - intMin) / 2; i++) {
					System.out.print(intMin + 2 * i + "\t");
				}
			}
		}

		scan.close();

	}

}
