import java.math.BigInteger;

class Solution {
	public int solution(String t, String p) {
		int answer = 0;

		// int 범위 초과
		BigInteger pNum = new BigInteger(p);

		for (int i = 0; i <= t.length() - p.length(); i++) {
			BigInteger num = new BigInteger(t.substring(i, i + p.length()));
			if (num.compareTo(pNum) <= 0) {
				answer++;
			}
		}
		return answer;
	}
}