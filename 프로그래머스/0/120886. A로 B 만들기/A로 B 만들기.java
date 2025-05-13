import java.util.Arrays;

class Solution {
	public int solution(String before, String after) {
		int answer = 0;
		char[] bch = before.toCharArray();
		char[] ach = after.toCharArray();

		Arrays.sort(bch);
		Arrays.sort(ach);

		answer = Arrays.equals(bch, ach) ? 1 : 0;
		return answer;
	}
}
