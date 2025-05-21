import java.util.Arrays;

class Solution {
	public int[] solution(int[] emergency) {
		int[] result = Arrays.copyOf(emergency, emergency.length);
		Arrays.sort(result);
		int[] answer = new int[result.length];

		for (int i = 0; i < emergency.length; i++) {
			for (int j = 0; j < emergency.length; j++) {
				if (emergency[i] == result[j]) {
					answer[i] = result.length - j;
				}
			}
		}

		return answer;
	}
}