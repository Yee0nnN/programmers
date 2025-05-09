class Solution {
	public int solution(int[] common) {
		int answer = 0;
		// 공차
		int i = common[2] - common[1];
		int j = common[1] - common[0];
		if (i == j) {
			answer = common[common.length - 1] + i;
		}
		//공비
		else {
			int k = common[1]/common[0];
			answer = common[common.length - 1] * k;
		}
		return answer;
	}
}