import java.util.Arrays;

class Solution {
	public int[] solution(int n, int[] numlist) {
		int[] answer = new int[numlist.length];
		int idx = 0;
		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				answer[idx++] = numlist[i];
			}
		}
		answer = Arrays.copyOf(answer, idx);
		return answer;
	}
}
