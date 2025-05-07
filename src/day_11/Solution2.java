package day_11;

import java.util.Arrays;

class Solution2 {
	public int[] solution(int n, int k) {
		int[] answer = new int[n/k];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = k * (i+1);
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(Arrays.toString(s.solution(10, 3)));
	}
}
