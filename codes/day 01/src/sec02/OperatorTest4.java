package sec02;

public class OperatorTest4 {

	// 삼항 연산자 실습 - BMI 계산기
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "김철수";
		int height = 170;
		int weight = 75;

		// BMI
		double bmiScore = (weight / ((height / 100) * (height / 100)));

		System.out.printf("%s씨는 키 %dcm, 몸무게 %dkg로 BMI 결과는 %s입니다.", name, height, weight, bmiScore > 30 ? "비만" : "정상");

	}

}
