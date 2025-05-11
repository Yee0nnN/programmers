import java.util.Arrays;

class Solution {
	public int[] solution(int n) {
		int[] answer = new int[n];
		int idx = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer[idx++] = i;
			}
		}
		answer = Arrays.copyOf(answer, idx);
		return answer;
	}
}
