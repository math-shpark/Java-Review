package sec02;

import java.util.Scanner;

public class Practice4 {

	// 1501. 2차원 배열 1
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 배열 크기 입력
		System.out.print("배열의 크기를 입력하세요. >> ");
		
		int size = scan.nextInt();
		
		// 입력한 크기에 맞춰 배열 생성
		int[][] arr = new int[size][size];
		
		// 등차수열 대입 로직
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				arr[i][j] = size * i + (j+1);
			}
		}
		
		// 결과 출력
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
		}
		
		scan.close();
		
	}

}
