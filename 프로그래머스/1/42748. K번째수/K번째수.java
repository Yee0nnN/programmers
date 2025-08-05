import java.util.Arrays;

class Solution {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			int a = commands[i][0] - 1;
			int b = commands[i][1];
			int c = commands[i][2] - 1;
			int[] result = new int[b - a];
			int idx = 0;
			
			for (int j = a; j < b; j++) {
				result[idx++] = array[j];
			}
			
			Arrays.sort(result);
			answer[i] = result[c];
		}
		return answer;
	}
}