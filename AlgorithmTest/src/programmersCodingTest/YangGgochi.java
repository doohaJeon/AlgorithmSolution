package programmersCodingTest;

public class YangGgochi {
	  public int solution(int n, int k) {
	        int answer = 0;
	        //10분에 음료수 하나가 서비스라서 n을 10으로 나눈수에 2000원을 곱함
	        //만약 10인분 미만이면 0이 나오게 함
	        answer =   (n *12000) + (k * 2000) - ((n / 10) *2000);
	        return answer;
	    }
}
