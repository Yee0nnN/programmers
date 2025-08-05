import java.util.Arrays;

class Solution {
	public int[] solution(int[] answers) {
		int[] answer = new int[3];
		int[] one = { 1, 2, 3, 4, 5 };
		int[] two = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] three = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int[] result = new int[3];
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == one[i % 5]) {
				result[0]++;
			}
			if (answers[i] == two[i % 8]) {
				result[1]++;
			}
			if (answers[i] == three[i % 10]) {
				result[2]++;
			}
		}

		int max = Math.max(result[0], Math.max(result[1], result[2]));

		int idx = 0;
		if (result[0] == max) {
			answer[idx++] = 1;
		}
		if (result[1] == max) {
			answer[idx++] = 2;
		}
		if (result[2] == max) {
			answer[idx++] = 3;
		}

		answer = Arrays.copyOf(answer, idx);

		return answer;
	}
}