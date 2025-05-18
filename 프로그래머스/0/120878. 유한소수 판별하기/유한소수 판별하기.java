class Solution {
	public int solution(int a, int b) {
		int answer = 0;
		while (b % 2 == 0)
			b /= 2;
		while (b % 5 == 0)
			b /= 5;
		answer = ((a % b == 0) || (b == 1)) ? 1 : 2;
		return answer;
	}
}
