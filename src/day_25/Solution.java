package day_25;

class Solution {
	public int[][] solution(int n) {
		int[][] answer = new int[n][n];
		int num = 1;
		int rowFirst = 0, colFirst = 0;
		int rowLast = n - 1, colLast = n - 1;
		while (num <= n * n) {
			// 오른쪽으로
			for (int i = colFirst; i <= colLast; i++) {
				answer[rowFirst][i] = num++;
			}
			rowFirst++;
			// 아래로
			for (int i = rowFirst; i <= rowLast; i++) {
				answer[i][colLast] = num++;
			}
			colLast--;
			// 왼쪽으로
			for (int i = colLast; i >= colFirst; i--) {
				answer[rowLast][i] = num++;
			}
			rowLast--;
			// 위로
			for (int i = rowLast; i >= rowFirst; i--) {
				answer[i][colFirst] = num++;
			}
			colFirst++;

		}

		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[][] result = s.solution(4);
		for (int[] row : result) {
			for (int x : row) {
				System.out.print(x + "\t");
			}
			System.out.println();
		}
	}
}
