package Lv0;

public class AdditionOfFractions {
 	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];

		// 공통분모 commonDenominator와 통분 후 분자를 더한 molecule
		int commonDenominator = 0;
		int molecule = 0;
		//공약수
		int cd = 1;
		commonDenominator = denom1 * denom2;
		molecule = numer1 * denom2 + numer2 * denom1;
		// 약분이 가능하면 최대공약수 구하기
		for (int i = 2; i <= molecule; i++) {
			if (molecule % i == 0 && commonDenominator % i == 0) {
				cd = i;
			}
		}
		answer[0] = molecule / cd;
		answer[1] = commonDenominator / cd;

		return answer;
	}
}
