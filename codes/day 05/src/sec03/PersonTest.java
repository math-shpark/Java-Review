package sec03;

class Person {
	String name;
	int age;

	Person() {

	}

	Person(String name) {

	}

	public void eat() {
		System.out.println("음식을 먹는다.");
	}
}

class Student extends Person {
	// 자식클래스의 생성자에서는 젤 처음 부모클래스의 기본생성자를 호출한다.
	// 부모클래스의 기본생성자가 없는 경우 명시적으로 super키워드를 이용해 부모클래스의 생성자를 호출해야 한다.
	Student() {
	}

	Student(String major) {
		super("name");
	}

	String major;

	public void study() {
		System.out.println("공부를 한다.");
	}

	public void eat() {
		super.eat();
		System.out.println("급식을 먹는다.");
	}

	public String toString() {
		return "저의 전공은 " + major + "입니다";
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.major = "CS";

		Object o = s;
		System.out.println(o);

		System.out.println(s);

//		final int a = 10;
//		a = 20;
	}
}
