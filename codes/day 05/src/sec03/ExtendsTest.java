package sec03;

class Parent {
	int data = 10;

	public void print() {
		System.out.println(data);
	}
}

class Child extends Parent {
	int data = 20;
	int x;

	public void print() {
		int data = 30;
		System.out.println(data);
		System.out.println(this.data);
		System.out.println(super.data);
	}

}

public class ExtendsTest {
	public static void main(String[] args) {
//		Child c = new Child();
//		c.print();
		Parent p = new Child();
//		System.out.println(p.data);
		p.print();
	}
}
//자식클래스의 객체를 생성하는 것은, 
//부모클래스의 객체를 먼저 선언한 후, 
//거기에 자식클래스를 이어 붙여서 객체생성을 완성
