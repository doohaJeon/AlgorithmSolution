package programmersCodingTest;

public class Sequence {
//	 public int solution(int[] common) {
//			int answer = 0;
//			
//			
//				if (common[1] - common[0] == common[2] - common[1]) {
//					
//					answer = common[common.length - 1] + common[1] - common[0];
//				}
//				if (common[1] / common[0] == common[2] / common[1]) {
//					
//					answer = common[common.length - 1] *common[1] / common[0];
//				}
//			
//
//			return answer;
//		}
		
	public int solution(int[] common) {
		int answer = 0;

		if (common[1] - common[0] == common[2] - common[1]) {

			answer = common[common.length - 1] + common[1] - common[0];
		} else {
			answer = common[common.length - 1] * common[1] / common[0];
		}

		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] common = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
		int [] common2 = {2, 4, 6, 8, 10, 12, 14, 16 ,18, 20};
		
		Sequence sq = new Sequence();
		System.out.println(sq.solution(common2));
	}

}
