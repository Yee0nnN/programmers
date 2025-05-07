package day_25;

class Solution4 {
	public int solution(int[][] board, int k) {
		int answer = 0;
		int row = board.length;
		int col = board[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i + j <= k) {
					answer += board[i][j];
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(s.solution(new int[][] { { 0, 1, 2 }, { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } }, 2));
	}
}
