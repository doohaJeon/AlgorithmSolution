package programmersCodingTest;

import java.util.ArrayList;

public class ArrayExam {
	public String[] solution(String my_str, int n) {
		
		ArrayList<String> list = new ArrayList<String>();
						
		while(true) {
			if(my_str.length() < n) {
				if(my_str.length() == 0) {
					break;
				} else {
					list.add(my_str);
					break;
				}
			}
			
			String subStr = my_str.substring(0, n);
			list.add(subStr);
			my_str = my_str.replace(subStr, "");
			
		}
		
		String[] answer = new String[list.size()];
		
		for(int i = 0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
	public static void main(String[] args) {
	
	}

}
