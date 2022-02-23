package sec02;

public class swap {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		// doSomething
		int tmp = a;
		a = b;
		b = tmp;

		System.out.printf("%d %d", a, b);

	}
}
