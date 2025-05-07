package day_14;

import java.util.Arrays;

class Solution5 {
	public int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[arr.length];
		for (int[] query : queries) {
			int start = query[0];
			int end = query[1];

			for (int i = start; i <= end; i++) {
				arr[i] += 1;
			}
		}
		answer = arr;
		return answer;
	}

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		System.out.println(
				Arrays.toString(s.solution(new int[] { 0, 1, 2, 3, 4 }, new int[][] { { 0, 1 }, { 1, 2 }, { 2, 3 } })));
	}
}
