package sec01;

import java.util.Scanner;

public class Practice2 {
	
	// 1094. 출석 2
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("학생 수를 입력하세요. >> ");

		// 학번 범위 지정
		int total = scan.nextInt();

		// 학생 수에 맞는 배열 생성
		int[] studentNum = new int[total];

		// 학번 생성
		for (int i = 0; i < studentNum.length; i++) {
			studentNum[i] = i + 1;
		}

		System.out.print("출석 부를 학생의 수를 입력하세요. >> ");

		// 출석 부를 학생 수 입력받기
		int call = scan.nextInt();

		System.out.print("출석 부를 학번을 입력하세요. (공백으로 구분) >> ");

		// 출석 부른 번호를 저장할 배열 생성
		int[] callStd = new int[call];

		// 출석 부른 번호를 배열에 대입하기
		for (int i = 0; i < call; i++) {
			int callNum = scan.nextInt();
			callStd[i] = callNum;
		}

		// 결과 출력
		System.out.println("출석 부른 번호의 역순입니다.");

		for (int i = (callStd.length - 1); i >= 0; i--) {
			System.out.print(callStd[i] + " ");
		}
		
		scan.close();
	}
}
