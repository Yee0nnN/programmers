import java.util.Arrays;

class Solution {
	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length * numbers.length];
		int idx = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int sum = numbers[i] + numbers[j];
				boolean isDup = false;

				for (int k = 0; k < idx; k++) {
					if (answer[k] == sum) {
						isDup = true;
						break;
					}
				}

				if (!isDup) {
					answer[idx++] = sum;
				}
			}
		}

		Arrays.sort(answer, 0, idx);

		return Arrays.copyOfRange(answer, 0, idx);
	}
}