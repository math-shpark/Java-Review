package sec02;

class Car{
	String color;
	private int speed;
	
	public void speedUp() {
		speed += 10;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car c = new Car();
		
		c.setSpeed(100);
		c.speedUp();
		
		System.out.println("자동차 속도 : " + c.getSpeed());
	}
}
