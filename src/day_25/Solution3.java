package day_25;

import java.util.Arrays;

class Solution3 {
	public int[][] solution(int[][] arr) {

		int row = arr.length;
		int col = arr[0].length;
		int size = (row < col) ? col : row;
		int[][] answer = new int[size][size];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				answer[i][j] = arr[i][j];
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		int[][] result = s
				.solution(new int[][] { { 572, 22, 37 }, { 287, 726, 384 }, { 85, 137, 292 }, { 487, 13, 876 } });
		for (int[] row : result) {
			System.out.println(Arrays.toString(row));
		}
	}
}
