package Lv0;

public class IndexChange {
	 public String solution(String my_string, int num1, int num2) {
	        String answer = "";
	        char ch = my_string.charAt(num1);
	        char ch2 = my_string.charAt(num2);
	        StringBuilder sb = new StringBuilder(my_string);
	        sb.setCharAt(num1, ch2);
	        sb.setCharAt(num2, ch);
	        answer = sb.toString();
	       
	        return answer;
	    }
}
