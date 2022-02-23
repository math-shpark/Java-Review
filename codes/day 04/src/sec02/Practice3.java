package sec02;

import java.util.Scanner;

public class Practice3 {

	// 1098. 설탕 과자 뽑기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("격자 판의 크기를 가로, 세로 순으로 입력하세요. (공백으로 구분) >> ");

		// 격자 판의 크기 입력 받기
		int weight = scan.nextInt(); // 가로
		int height = scan.nextInt(); // 세로

		// 설정한 크기에 맞춰 격자 생성
		int[][] place = new int[height][weight];

		System.out.print("올려 놓을 막대의 개수를 입력하세요. >> ");

		// 막대의 개수 입력받기
		int count = scan.nextInt();

		// 막대 위치 입력 로직
		for (int i = 0; i < count; i++) {
			System.out.print((i + 1) + "번째 막대의 길이, 방향, x좌표, y좌표를 입력하세요. (공백으로 구분) >> ");

			int length = scan.nextInt(); // 길이
			int direction = scan.nextInt(); // 방향(가로 0, 세로 1)
			int x = scan.nextInt() - 1; // x좌표
			int y = scan.nextInt() - 1; // y좌표

			// 가로 방향 로직 (격자 밖으로 나가는 막대 부분은 제거)
			if (direction == 0) {
				for (int j = y; j < Math.min(y + length, weight); j++) {
					if (place[x][j] == 0) {
						place[x][j] = 1;
					}
				}
			} 
			// 세로 방향 로직 (격자 밖으로 나가는 막대 부분은 제거)
			else if (direction == 1) {
				for (int j = x; j < Math.min(x + length, height); j++) {
					if (place[j][y] == 0) {
						place[j][y] = 1;
					}
				}
			}

		}

		// 결과 출력
		System.out.println("막대의 위치입니다.");

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < weight; j++) {
				System.out.print(place[i][j] + " ");
			}
			System.out.println("");
		}

		scan.close();
	}

}
