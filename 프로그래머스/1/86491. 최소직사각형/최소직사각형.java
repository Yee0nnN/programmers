class Solution {
	public int solution(int[][] sizes) {
		int answer = 0;
		int maxWidth = 0;
		int maxHeight = 0;

		for (int[] size : sizes) {
			maxWidth = Math.max(maxWidth, Math.max(size[0], size[1]));
			maxHeight = Math.max(maxHeight, Math.min(size[0], size[1]));
		}

		answer = maxHeight * maxWidth;

		return answer;
	}
}