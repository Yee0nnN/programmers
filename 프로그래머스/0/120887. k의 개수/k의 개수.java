class Solution {
	public int solution(int i, int j, int k) {
		int answer = 0;

		for (int num = i; num <= j; num++) {
			String str = Integer.toString(num);
			for (int idx = 0; idx < str.length(); idx++) {
				if (str.charAt(idx) == Integer.toString(k).charAt(0)) {
					answer++;
				}
			}
		}
		return answer;
	}
}
