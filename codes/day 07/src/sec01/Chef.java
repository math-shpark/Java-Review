package sec01;

public abstract class Chef {

	int age;
	String name;
	String speciality;
	boolean isSmoke;

	public String eat(String food) {
		System.out.println(food + "먹는다.");

		return food + "를 먹었다.";
	}

	public abstract void cook();

}
