class Solution {
	public int solution(int chicken) {
		int answer = -1;
		int service = 0;

		while (chicken >= 10) {
			int num = chicken / 10;
			service += num;
			chicken = chicken % 10 + num;
		}
		answer = service;
		return answer;
	}
}