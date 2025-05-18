import java.util.Arrays;

class Solution {
	public int[] solution(String my_string) {
		String str = my_string.replaceAll("[^0-9]", "");
		String[] strArr = str.split("");
		int[] answer = new int[strArr.length];

		for (int i = 0; i < strArr.length; i++) {
			answer[i] = Integer.parseInt(strArr[i]);
		}
		Arrays.sort(answer);
		return answer;
	}
}