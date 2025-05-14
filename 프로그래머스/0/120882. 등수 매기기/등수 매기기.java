class Solution {
	public int[] solution(int[][] score) {
		int[] answer = new int[score.length];
		int[] total = new int[score.length];

		for (int i = 0; i < score.length; i++) {
			total[i] = score[i][0] + score[i][1];
		}

		for (int i = 0; i < score.length; i++) {
			answer[i] = 1;
			for (int j = 0; j < score.length; j++) {
				if (total[i] < total[j]) {
					answer[i]++;
				}
			}
		}
		return answer;
	}
}
