package sec02;

public class PersonTest {
	public static void main(String[] args) {
//		String name1 = "Hong";
//		String name2 = "Kim";
//
//		int age1 = 23;
//		int age2 = 30;
//		
//		int height1 = 170;
//		int height2 = 180;
//		
//		int[] arr = new int[3];
		// 클래스는 변수와 함수를 묶어서 만든 사용자정의 자료형
		Person p1 = new Person("Hong", 23, 179);
//		p1.name = "Hong";
//		p1.age = 23;
//		p1.height = 179;
		Person p2 = new Person("Kim", 30, 185);
//		p2.name = "Kim";
//		p2.age = 30;
//		p2.height = 185;
		Person p3 = new Person();

//		System.out.println("사람의 이름은 " + p1.name + "입니다.");
//		System.out.println("나이는 " + p1.age + "이구요, 키는 " + p1.height + "입니다.");
//		
//		System.out.println("사람의 이름은 " + p2.name + "입니다.");
//		System.out.println("나이는 " + p2.age + "이구요, 키는 " + p2.height + "입니다.");
//		printPerson(p1);
//		printPerson(p2);

		p1.print();
		p2.print();

	}

	static void printPerson(Person p) {
		System.out.println("사람의 이름은 " + p.name + "입니다.");
		System.out.println("나이는 " + p.age + "이구요, 키는 " + p.height + "입니다.");
	}
}
