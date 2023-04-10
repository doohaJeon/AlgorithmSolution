package Lv0;

public class FrequentNumber {

    public int solution(int[] array) {
        int answer = array[0];
        int max = 0;
        int []frequent = new int[1000];
        for(int i = 0; i<array.length; i++){
            frequent[array[i]]++;
            if(max < frequent[array[i]]){
                max = frequent[array[i]];
                answer = array[i];
            }
        }
        //최빈값 빈도수가 여러개인지 검사 
        int temp = 0;
        for(int j = 0; j<1000; j++){
        	//가장 많이 빈도수랑 같은 숫자가 있으면 temp++
            if(max == frequent[j]){
                temp++;
            }
            //temp가 2이상이면 최빈값이 두개 이상이라는 소리
            if(temp > 1){
                answer = -1;
            }
        }
        return answer;
    }
}
