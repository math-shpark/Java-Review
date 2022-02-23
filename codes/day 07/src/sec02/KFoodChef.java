package sec02;

public class KFoodChef implements Chef, Person {

	@Override
	public void eat() {
		System.out.println("한식을 먹는다");
	}

	@Override
	public void cook() {
		System.out.println("한식을 요리한다.");
	}
	
	@Override
	public void sleep() {
		System.out.println("잠을 잔다.");
	}

}
