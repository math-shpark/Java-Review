package sec02;

public class FunctionTest {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Welcome to SSAFY");
		int a = work("자동차");
		System.out.println(a);
		System.out.println("다 수행되면 이쪽일 하던거 해야지");
		int b = work("자전거");
	}

	static int work(String name) {
		System.out.println(name + "를 타고 출근한다.");
		System.out.println("소와 같이 일을 한다.");
		System.out.println(name + "를 타고 퇴근한다.");
		return 3;
	}
}
