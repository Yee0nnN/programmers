package day_07;

//01.수열과 구간 쿼리 4
import java.util.Arrays;

class Solution {
	public int[] solution(int[] arr, int[][] queries) {
		int[] answer = Arrays.copyOf(arr, arr.length); // arr 배열 복사

		for (int q = 0; q < queries.length; q++) {
			int s = queries[q][0];
			int e = queries[q][1];
			int k = queries[q][2];

			for (int i = s; i <= e; i++) {
				if (i % k == 0) {
					answer[i] = answer[i] + 1;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] result = s.solution(
				new int[] {0, 1, 2, 4, 3}, 
				new int[][] {{0, 4, 1},{0, 3, 2},{0, 3, 3}});
		System.out.println(Arrays.toString(result));
	}
}


