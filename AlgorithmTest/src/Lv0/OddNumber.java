package Lv0;

public class OddNumber {
//	정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
	public int[] solution(int n) {
        if(n % 2 == 1)
            n = n + 1;
        int a = n/2;
       int[] answer = new int[a];
       int index = 0;
       for(int i = 1; i<=n; i++) {
       	if(i % 2 == 1) {
       		answer[index++] = i;
       	}
       }
       return answer;
   }
	 public static void main(String[] args) {
//		OddNumber odd = new OddNumber();
//		odd.solution(10);
		int n = 15;
		if (n % 2 == 1)
				n = n + 1;
		int a = n /2;
		System.out.println(a);
		
	}
}
