package sec03;

public class SwitchTest {

	// switch 문 실습 - 월말일 계산하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = 3;

		System.out.println("Month : " + month);

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Last day : 31");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Last day : 30");
			break;
		case 2:
			System.out.println("We have to chech the year.");
			break;
		default:
			System.out.println("There is no such month.");
		}

	}

}
