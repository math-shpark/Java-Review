package sec01;

public class CarTest {

	public static void main(String[] args) {

		Car.carCnt++; // static 변수라 객체를 생성하지 않아도 된다!

		System.out.println(Car.carCnt);

		Car car2 = new Car();

		car2.name = "그랜저";

		car2.carCnt++;

		System.out.println(Car.carCnt);
		System.out.println(car2.carCnt);
	}

}
