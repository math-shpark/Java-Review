package sec01;

import java.util.Arrays;

public class ArrayTest1 {

	// 1차원 배열 실습
	public static void main(String[] args) {

		int[] score = new int[5];

		score[0] = 56;
		score[1] = 73;
		score[2] = 98;
		score[3] = 40;
		score[4] = 77;

		// 배열에 저장된 데이터 출력
		System.out.print("배열에 저장된 데이터 : ");

		for (int i = 0; i < score.length - 1; i++) {
			System.out.print(score[i] + ", ");
		}
		
		System.out.println(score[score.length - 1]);
		
		System.out.println("배열에 저장된 데이터 : " + Arrays.toString(score));

		// 배열에 저장된 데이터 중 최댓값 출력
		int max = 0;
		int maxIdx = 0;

		for (int j = 0; j < score.length; j++) {
			if (max < score[j]) {
				max = score[j];
				maxIdx = j;
			}
		}

		System.out.println("최댓값 : " + max);
		System.out.println("최댓값이 저장된 위치 : " + maxIdx);

		// 최댓값을 맨 앞으로 이동
		int temp = score[0];
		score[0] = score[maxIdx];
		score[maxIdx] = temp;

		System.out.println("맨 앞에 저장된 데이터 : " + score[0]);

	}

}
