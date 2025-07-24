class Solution {
	public String solution(int[] food) {
		String answer = "";
		int totalCount = 0;
		for (int i = 1; i < food.length; i++) {
			totalCount += (food[i] / 2) * 2;
		}
		int len = totalCount + 1;

		String[] result = new String[len];
		int left = 0;
		int right = len - 1;

		for (int i = 1; i < food.length; i++) {
			int count = food[i] / 2;

			for (int j = 0; j < count; j++) {
				result[left++] = String.valueOf(i);
				result[right--] = String.valueOf(i);
			}
		}

		result[len / 2] = "0";

		for (String r : result) {
			answer += r;
		}

		return answer;
	}
}
