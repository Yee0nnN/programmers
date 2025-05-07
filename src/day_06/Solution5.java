package day_06;

//05.수열과 구간 쿼리 2
import java.util.Arrays;

class Solution5 {
	public int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];

		for (int q = 0; q < queries.length; q++) {
			int s = queries[q][0];
			int e = queries[q][1];
			int k = queries[q][2];

			int min = Integer.MAX_VALUE;

			for (int i = s; i <= e; i++) {
				if (arr[i] > k && arr[i] < min) {
					min = arr[i];
				}
			}
			answer[q] = (min != Integer.MAX_VALUE) ? min : -1;
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		int[] result = s.solution(new int[] { 0, 1, 2, 4, 3 }, new int[][] { { 0, 4, 2 }, { 0, 3, 2 }, { 0, 2, 2 } });
		System.out.println(Arrays.toString(result));
	}
}
