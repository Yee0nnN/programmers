class Solution {
	public int solution(int[][] lines) {
		int answer = 0;
		int[] num = new int[200];

		for (int[] line : lines) {
			for (int i = (line[0] + 100); i < (line[1] + 100); i++) {
				num[i]++;
			}
		}
		for (int length : num) {
			if (length > 1) {
				answer++;
			}
		}
		return answer;
	}
}