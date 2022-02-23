package sec02;

import java.util.Scanner;

public class Practice1 {

	// 1096. 바둑판 흰돌 놓기
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("바둑판의 크기를 가로, 세로 순으로 입력하세요. (공백으로 구분) >> ");

		// 바둑판의 크기 입력 받기
		int weight = scan.nextInt(); // 가로
		int height = scan.nextInt(); // 세로

		// 설정한 크기에 맞춰 바둑판 생성
		int[][] place = new int[height][weight];

		System.out.print("올려 놓을 흰 돌의 개수를 입력하세요. >> ");

		// 흰 돌의 개수 입력받기
		int stoneNum = scan.nextInt();

		// 입력되는 좌표에 맞춰 배열 값을 1로 변경
		for (int i = 0; i < stoneNum; i++) {
			System.out.print((i + 1) + "번째 돌을 올려놓을 좌표를 입력하세요. (공백으로 좌표 구분) >> ");
			
			int x = scan.nextInt() - 1;
			int y = scan.nextInt() - 1;
			
			place[x][y] = 1;
		}
		
		// 결과 값 출력
		System.out.println("흰 돌의 위치입니다.");
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < weight; j++) {
				System.out.print(place[i][j] + " ");
			}
			System.out.println("");
		}
		
		scan.close();
	}

}
