package sec01;

import java.util.Scanner;

public class Practice1 {

	// 1093. 출석 1
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

		// 학번별 출석 부른 횟수를 저장할 배열 생성
		int[] countCall = new int[total];

		System.out.println("[ 학번별 출석 부른 횟수 ]");

		// 학번별 출석 부른 횟수를 배열에 대입하기
		// 대입하지 않으면 0(기본값)이 저장되어 있음
		for (int i = 0; i < studentNum.length; i++) {
			for (int j = 0; j < callStd.length; j++) {
				if (studentNum[i] == callStd[j]) {
					countCall[i]++;
				}
			}
		}

		// 결과값 출력
		for (int i = 0; i < studentNum.length; i++) {
			System.out.println((i + 1) + "번 : " + countCall[i] + "회");
		}

		scan.close();
	}

}
