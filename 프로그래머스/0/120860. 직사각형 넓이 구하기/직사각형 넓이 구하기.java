class Solution {
	public int solution(int[][] dots) {
		int answer = 0;
		int X = 0;
		int Y = 0;
		for (int i = 0; i < dots.length; i++) {
			for (int j = i + 1; j < dots.length; j++) {
				if (dots[i][0] == dots[j][0]) {
					X = Math.abs(dots[i][1] - dots[j][1]);
				} else if (dots[i][1] == dots[j][1]) {
					Y = Math.abs(dots[i][0] - dots[j][0]);
				}
			}
		}
		answer = X * Y;
		return answer;
	}
}