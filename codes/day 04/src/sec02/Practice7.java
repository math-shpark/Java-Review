package sec02;

import java.util.Scanner;

public class Practice7 {
	
	// 1512. 숫자 등고선
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 배열 크기 입력 받기
		System.out.print("배열의 크기를 입력하세요. >> ");
		
		int size = scan.nextInt();
		
		// 입력받은 크기에 맞춰 배열 생성
		int[][] place = new int[size][size];
		
		System.out.print("등고선 시작 좌표를 입력하세요. >> ");
		
		// 중심 좌표 입력
		int x = scan.nextInt() - 1;
		int y = scan.nextInt() - 1;
		
		// 거리 비례 값 대입
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				place[i][j] = (Math.max(i, x) - Math.min(i, x)) + (Math.max(j, y) - Math.min(j, y)) + 1;
			}
		}
		
		// 결과 출력
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(place[i][j]);
			}
			System.out.println("");
		}
		
		scan.close();
		
	}

}
