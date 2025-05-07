package day_17;

import java.util.Arrays;

class Solution4 {
    public String[] solution(String my_string) {
        return my_string.split(" ");
    }
    
    public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(Arrays.toString(s.solution("i love you")));
	}
}