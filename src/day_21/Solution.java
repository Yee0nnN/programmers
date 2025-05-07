package day_21;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] answer = Arrays.copyOfRange(num_list, 5, num_list.length);
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution(new int[] {12, 4, 15, 46, 38, 1, 14, 56, 32, 10})));
	}
}
