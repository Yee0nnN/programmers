import java.util.Arrays;

class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n;
		Arrays.sort(lost);
		Arrays.sort(reserve);

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}

		for (int i = 0; i < lost.length; i++) {
			if (lost[i] == -1)
				continue;

			boolean isFound = false;
			for (int j = 0; j < reserve.length; j++) {
				if (reserve[j] == -1)
					continue;

				if (lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1) {
					reserve[j] = -1;
					isFound = true;
					break;
				}
			}

			if (!isFound)
				answer--;
		}
		return answer;
	}
}