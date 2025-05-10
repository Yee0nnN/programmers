class Solution {
	public int solution(int n) {
		int num = (int) Math.sqrt(n);
		int answer = (num * num == n) ? 1 : 2;
		return answer;
	}
}
