package sec02;

import java.util.Scanner;

public class Practice6 {

	// 1507. 4개의 직사각형 넓이
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 전체 좌표 평면 생성
		int[][] place = new int[100][100];
		
		// 직사각형이 덮는 자리 색칠하는 로직
		for (int i = 0; i < 4; i++) {
			System.out.print((i+1) + "번째 직사각형의 좌표를 입력하세요. >> ");
			
			int x1 = scan.nextInt() - 1;
			int y1 = scan.nextInt() - 1;
			int x2 = scan.nextInt() - 1;
			int y2 = scan.nextInt() - 1;
			
			for (int j = x1; j < x2; j++) {
				for (int k = y1; k < y2; k++) {
					place[j][k] = 1;
				}
			}
		}
		
		int area = 0; // 넓이
		
		// 색칠된 공간 세기
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (place[i][j] == 1) {
					area++;
				}
			}
		}
		
		System.out.println(area);
		
		scan.close();

	}

}
