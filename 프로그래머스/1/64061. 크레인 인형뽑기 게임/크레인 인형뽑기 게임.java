class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		int[][] colBoard = new int[board.length][board.length];
		int[] result = new int[moves.length * board.length];
		int top = -1;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				colBoard[j][i] = board[i][j];
			}
		}
		for (int move : moves) {
			int col = move - 1;

			for (int i = 0; i < board.length; i++) {
				if (colBoard[col][i] != 0) {
					int doll = colBoard[col][i];
					colBoard[col][i] = 0;

					if (top >= 0 && result[top] == doll) {
						top--; // 제거
						answer += 2;
					} else { // 추가
						result[++top] = doll;
					}
					break;
				}
			}
		}

		return answer;
	}
}