package sec02;

import java.util.Scanner;

public class Practice3 {

	// 1271. 최대값 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("입력할 숫자의 개수를 알려주세요. >> ");

		int dataNum = scan.nextInt();
		scan.nextLine();

		System.out.print("숫자를 입력해주세요. (공백으로 구분) >> ");

		String numSet = scan.nextLine();

		String[] eachNum = numSet.split(" ");

		Double[] numbers = new Double[dataNum];

		for (int i = 0; i < dataNum; i++) {
			numbers[i] = Double.parseDouble(eachNum[i]);
		}

		for (int j = 0; j < dataNum; j++) {
			for (int k = j + 1; k < dataNum; k++) {
				if (numbers[j] > numbers[k]) {
					double temp = numbers[j];
					numbers[j] = numbers[k];
					numbers[k] = temp;
				}
			}
		}

		System.out.println("최댓값 : " + numbers[dataNum - 1]);

		scan.close();

	}

}
