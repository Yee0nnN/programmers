class Solution {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && 6 % i == 0) {
				answer = ((n / i) * (6 / i) * i) / 6;
			}
		}
		return answer;
	}
}