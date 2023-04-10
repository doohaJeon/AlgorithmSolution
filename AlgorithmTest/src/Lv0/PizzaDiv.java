package Lv0;

public class PizzaDiv {
//	머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 피자 조각 수 slice와 
//	피자를 먹는 사람의 수 n이 매개변수로 주어질 때, n명의 사람이 최소 한 조각 이상 피자를 먹으려면 
//	최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
	
	 public int solution(int slice, int n) {
	        int answer = 0;
	        //인명수에서 조각수 만큼 나눠서 나누어떨어지면 나눈 수만큼 피자를 시키면 됨.
	        if(n % slice == 0){
	            answer = n / slice;
	        } else { //만약 나누어떨어지지 않으면 피자를 한 판 더 시키면 됨.
	            answer = n / slice + 1;
	        }
	        return answer;
	    }
}
