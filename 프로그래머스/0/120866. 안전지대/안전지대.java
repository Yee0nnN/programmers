class Solution {
	public int solution(int[][] board) {
		int answer = 0;

		int[][] list = new int[board.length + 2][board.length + 2];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == 1) {
					for (int n = i; n <= i + 2; n++) {
						for (int m = j; m <= j + 2; m++) {
							list[n][m] = 1;
						}
					}
				}
			}
		}

		for (int i = 1; i <= board.length; i++) {
			for (int j = 1; j <= board.length; j++) {
				if (list[i][j] == 0) {
					answer++;
				}
			}
		}
		return answer;
	}
}