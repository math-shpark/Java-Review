package sec03;

public class ExceptionTest {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };

		try {
			System.out.println(nums[5]);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("배열 인덱스가 잘못 입력됨");
		}

		System.out.println("프로그램 종료");

	}

}
