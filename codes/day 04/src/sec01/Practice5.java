package sec01;

import java.util.Arrays;
import java.util.Scanner;

public class Practice5 {

	// 1492. 누적 합 배열
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하세요. >> ");

		int size = scan.nextInt();

		int[] arr = new int[size];

		// 입력한 데이터를 배열에 저장
		System.out.print("배열에 저장할 데이터를 입력하세요. (공백으로 구분) >> ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		// 입력한 배열 확인
		System.out.println("입력한 배열입니다.");
		System.out.println(Arrays.toString(arr));

		// 누적 합 구하기
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i] + arr[i - 1];
		}

		// 결과 출력
		System.out.println("누적합 배열입니다.");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		scan.close();

	}

}
