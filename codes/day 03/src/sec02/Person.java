package sec02;

//생성자란 객체가 생성될때 최초 한번 수행되는 함수.
//생성자라는 함수의 이름은 클래스명
//생성자는 반환유형이 없다. void가 아니고 아얘 문법적으로 반환유형이 없다.
//생성자를 하나도 만들지 않으면, 몸통이 비어있는 기본생성자를 컴파일러가 자동으로 생성해준다.
public class Person {
	String name;
	int age;
	int height;
	
	//생성자도 함수니까.. 필요하다면 매개변수를 받을 수 있음.
	Person(String name, int age, int height){
		this.name = name;
		this.age = age;
		this.height = height;
		//모든 객체가 생성될때 수행되어야 하는 코드
	}
	//생성자도 함수니까.. 오버로딩이 가능.
	Person(){
		//다른 생성자를 호출할때는 이름 대신에 this키워드를 쓰도록 하고
		//다른 생성자를 호출하려면 현재 생성자에서 아직 아무짓도 하지 않았어야 함.
		this("Hong", 23, 179);
		System.out.println("저는 기본생성자라고 합니다.");
	}
	
	//메소드 오버로딩 : 이름이 같고 매개변수가 다른 메소드를 여러개 정의하는 것
	void print() {
		int age = 10;
		System.out.println("사람의 이름은 " + this.name + "입니다.");
		System.out.println("나이는 " + this.age + "이구요, 키는 " + this.height + "입니다.");
	}
	void print(int n) {
		System.out.println("매개변수 정수 n");
	}
	void print(double n) {
		System.out.println("매개변수 실수 n");
	}
}




