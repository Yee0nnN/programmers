package day_12;

import java.util.Arrays;

class Solution3 {
	public int[] solution(int[] arr, int[][] intervals) {
		int[] answer = {};

		int size = 0;
		for (int i = 0; i < intervals.length; i++) {
			int start = intervals[i][0];
			int end = intervals[i][1];

			size += (end - start) + 1;
		}
		answer = new int[size];
		int idx = 0;

		for (int i = 0; i < intervals.length; i++) {
			int start = intervals[i][0];
			int end = intervals[i][1];
			for (int j = start; j <= end; j++) {
				answer[idx++] = arr[j];
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out
				.println(Arrays.toString(s.solution(new int[] { 1, 2, 3, 4, 5 }, new int[][] { { 1, 3 }, { 0, 4 } })));
	}
}