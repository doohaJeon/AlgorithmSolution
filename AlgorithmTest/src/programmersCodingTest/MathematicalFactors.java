package programmersCodingTest;

public class MathematicalFactors {
	public int[] solution(int n) {
		   
		   int index = 0;
         int count = 0;
		for(int i = 1; i<=n; i++) {
			if(n % i == 0) {
             count++;
			}
		}
     int []answer = new int[count];
     for(int i = 1; i<=n; i++){
         if(n % i == 0){
             answer[index++] = i;
         }
     }
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
