package sec01;

import java.util.Scanner;

public class Practice3 {

	// 1095. 출석 3
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

		// 출석 부른 번호 오름차순 정렬
		for (int i = 0; i < callStd.length; i++) {
			for (int j = i + 1; j < callStd.length; j++) {
				if (callStd[i] > callStd[j]) {
					int temp = callStd[i];
					callStd[i] = callStd[j];
					callStd[j] = temp;
				}
			}
		}

		// 결과 출력
		System.out.println("오늘 부른 학번 중 가장 앞번호는 " + callStd[0] + "번 입니다.");

		scan.close();
	}

}
