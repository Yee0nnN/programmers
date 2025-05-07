package day_11;

import java.util.Arrays;

class Solution5 {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        
        for(int i=idx; i<arr.length; i++) {
        	if(arr[i] == 1) {
        		answer = i;
                break;
        	}
        	else {
        		answer = -1;
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		Solution5 s = new Solution5();
		System.out.println(s.solution(new int[] {0,0,0,1}, 1));
	}
}
