package sec01;

public class VariableTest {

	// 변수 실습 - 형변환
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = a; // a값을 b에 대입

		System.out.println("a : " + a);
		System.out.println("b : " + b);

		System.out.println("");

		a = 12;

		System.out.println("a값 변경 후 a와 b");
		System.out.printf("a : %d \n", a);
		System.out.printf("b : %d \n", b);
		
		// 묵시적 형변환
		short c = 332;
		int d = c;
		
		// 명시적 형변환
		short e = (short) d;
		float f = 10;
		int g = (int) f; // 크기가 같아도 명시적 형변환은 타입 기재 필수

	}

}
