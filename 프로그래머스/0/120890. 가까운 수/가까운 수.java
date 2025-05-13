import java.util.Arrays;

class Solution {
	public int solution(int[] array, int n) {
		int answer = 0;
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			if (Math.abs(array[0] - n) > Math.abs(array[i] - n)) {
				array[0] = array[i];
			}
		}
		answer = array[0];
		return answer;
	}
}