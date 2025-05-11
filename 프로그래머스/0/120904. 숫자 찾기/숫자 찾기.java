class Solution {
	public int solution(int num, int k) {
		int answer = -1;
		String[] str = Integer.toString(num).split("");
		String strk = Integer.toString(k);
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(strk)) {
				return i + 1;
			}
		}
		return answer;
	}
}
