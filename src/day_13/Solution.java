package day_13;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[(num_list.length-n)+1];
        int idx = 0;
        for(int i=n-1; i<num_list.length;i++) {
        	answer[idx] = num_list[i];
        	idx++;
        }
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution(new int[] {2, 1, 6}, 3)));
	}
}
