package sec02;

import java.util.Scanner;

public class Practice2 {

	// 1097. 바둑알 십자가 뒤집기
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("바둑판의 크기를 가로, 세로 순으로 입력하세요. (공백으로 구분) >> ");

		// 바둑판의 크기 입력 받기
		int weight = scan.nextInt(); // 가로
		int height = scan.nextInt(); // 세로

		// 설정한 크기에 맞춰 바둑판 생성
		int[][] place = new int[height][weight];

		System.out.print("십자 뒤집기 횟수를 입력하세요. >> ");

		// 게임 횟수 입력받기
		int gameCount = scan.nextInt();

		// 게임 구현 로직
		for (int i = 0; i < gameCount; i++) {
			System.out.print((i + 1) + "번째 십자 뒤집기 할 좌표를 입력하세요. (공백으로 좌표 구분) >> ");

			// 중심 좌표 입력받기
			int x = scan.nextInt() - 1;
			int y = scan.nextInt() - 1;

			// 가로 방향 뒤집기
			// 1. if-else 2. 삼항 연산 3. a = 1 - a 4. 비트 연산자(^)
			for (int j = 0; j < weight; j++) {
				if (place[x][j] == 0) {
					place[x][j] = 1;
				} else if (place[x][j] == 1) {
					place[x][j] = 0;
				}
			}

			// 세로 방향 뒤집기(중심 좌표 제외)
			for (int j = 0; j < height; j++) {
				if (place[j][y] == 0 && j != x) {
					place[j][y] = 1;
				} else if (place[j][y] == 1 && j != x) {
					place[j][y] = 0;
				}
			}
		}

		// 게임 결과 출력
		System.out.println("십자뒤집기 결과입니다.");

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < weight; j++) {
				System.out.print(place[i][j] + " ");
			}
			System.out.println("");
		}

		scan.close();
	}

}
