package day_14;

import java.util.Arrays;

class Solution2 {
    public String[] solution(String[] names) {
    	int count = (names.length%5==0) ? names.length/5 : (names.length/5)+1;
        String[] answer = new String[count];
        int idx=0;
        for(int i=0; i<names.length; i++){
        	if(i%5==0) {
        		answer[idx++] = names[i];
        	}
            
        }
        return answer;
    }
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(Arrays.toString(s.solution(new String[] { "nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx" })));
	}
}
