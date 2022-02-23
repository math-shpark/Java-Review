package sec01;

import java.util.Scanner;

public class StudentTest2 {

	static Student[] students = new Student[100];
	static int size = 0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		StudentManager manager = new StudentManager();

		int menuNum;

		do {
			System.out.println("[ 메뉴 ]");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 조회");
			System.out.println("3. 전공 변경");
			System.out.println("0. 프로그램 종료 \n");
			System.out.print("메뉴를 선택하세요. >> ");

			menuNum = scan.nextInt();

			if (menuNum == 1) {

				System.out.println("\n학생을 추가합니다.");
				System.out.println("추가하는 학생의 정보를 입력하세요.");

				System.out.print("학생 이름 : ");
				String name = scan.next();

				System.out.print("학생 나이 : ");
				int age = scan.nextInt();

				System.out.print("학생 전공 : ");
				String major = scan.next();

				Student s = new Student();

				s.name = name;
				s.age = age;
				s.major = major;

				students[size++] = s;

				System.out.println("");

			} else if (menuNum == 2) {

				System.out.println("\n학생을 조회합니다.");
				System.out.print("조회할 학생의 이름을 입력하세요. >> ");

				String name = scan.next();

				int index = manager.findStudent(name);

				if (index == -1) {
					System.out.println("\n해당 학생이 조회되지 않습니다.");
				} else {
					System.out.println("\n조회한 학생의 정보입니다.");
					System.out.println("이름 : " + manager.getStudent(name).name);
					System.out.println("나이 : " + manager.getStudent(name).age);
					System.out.println("전공 : " + manager.getStudent(name).major + "\n");
				}

			} else if (menuNum == 3) {
				System.out.println("\n전공을 변경합니다.");
				System.out.print("이름 : ");
				String name = scan.next();

				System.out.print("전공 : ");
				String major = scan.next();

				manager.changeMajor(name, major);
			}
		} while (menuNum != 0);

		System.out.println("프로그램을 종료합니다.");

		scan.close();

	}

}
