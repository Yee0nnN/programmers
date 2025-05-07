package day_20;

import java.util.Arrays;

class Solution5 {
	public int[] solution(int[] num_list) {
		Arrays.sort(num_list);
        int[] answer = Arrays.copyOfRange(num_list, 0, 5);
        return answer;
    }

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		System.out.println(Arrays.toString(s.solution(new int[] { 12, 4, 15, 46, 38, 1, 14 })));

	}
}
