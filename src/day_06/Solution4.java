package day_06;

//04.수열과 구간 쿼리 1
import java.util.Arrays;

class Solution4 {
	public int[] solution(int[] arr, int[][] queries) {
		int[] answer = {};

		for (int[] q : queries) {
			int i = q[0];
			int j = q[1];

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		answer = arr;

		return answer;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		int[] result = s.solution(new int[] { 0, 1, 2, 3, 4 }, new int[][] { { 0, 3 }, { 1, 2 }, { 1, 4 } });
		System.out.println(Arrays.toString(result));
	}
}
