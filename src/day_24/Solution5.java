package day_24;

import java.util.Arrays;

class Solution5 {
	public int[][] solution(int n) {
		int[][] answer = new int[n][n];
		for (int i = 0; i < n; i++) {
			answer[i][i] = 1;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Solution5 s = new Solution5();
		System.out.println(Arrays.toString(s.solution(3)));
		System.out.println(Arrays.toString(s.solution(6)));
		System.out.println(Arrays.toString(s.solution(1)));
	}
}
