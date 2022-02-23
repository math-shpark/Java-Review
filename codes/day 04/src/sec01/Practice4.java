package sec01;

import java.util.Scanner;

public class Practice4 {

	// 1411. 빠진 카드
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("전체 카드의 수를 입력하세요. >> ");

		// 전체 카드의 수 입력 받기
		int total = scan.nextInt();

		// 카드 번호를 대입할 배열 생성
		int[] cards = new int[total];

		for (int i = 0; i < total; i++) {
			cards[i] = i + 1;
		}

		// 가지고 있는 카드 번호 조회
		for (int i = 1; i < total; i++) {
			System.out.print(i + "번째 카드 번호를 입력하세요. >> ");

			int cardNum = scan.nextInt();

			// 가지고 있는 번호면 배열에 0을 저장
			for (int j = 0; j < cards.length; j++) {
				if (cardNum == cards[j]) {
					cards[j] = 0;
				}
			}
		}

		// 없는 카드 번호 출력
		for (int i = 0; i < total; i++) {
			if (cards[i] != 0) {
				System.out.println((i + 1) + "번 카드가 없습니다.");
			}
		}

		scan.close();
	}
}
