package day_08;

import java.util.Arrays;

//02.주사위 게임 3
class Solution2 {
	public int solution(int a, int b, int c, int d) {
		int answer = 0;

		int[] arr = new int[] { a, b, c, d };
		Arrays.sort(arr);

		if (arr[0] == arr[3]) {
			answer = 1111 * arr[0];
		} else if ((arr[1] == arr[2]) && (arr[0] != arr[3]) && (arr[0] == arr[1])) {
			answer = (10 * arr[2] + arr[3]) * (10 * arr[2] + arr[3]);
		} else if ((arr[1] == arr[2]) && (arr[0] != arr[3]) && (arr[2] == arr[3])) {
			answer = (10 * arr[2] + arr[0]) * (10 * arr[2] + arr[0]);
		} else if ((arr[0] == arr[1]) && (arr[2] == arr[3])) {
			answer = (arr[0] + arr[3]) * Math.abs(arr[0] - arr[3]);
		} else if ((arr[0] == arr[1]) && (arr[2] != arr[3])) {
			answer = arr[2] * arr[3];
		} else if ((arr[1] == arr[2]) && (arr[0] != arr[3])) {
			answer = arr[0] * arr[3];
		} else if ((arr[2] == arr[3]) && (arr[0] != arr[1])) {
			answer = arr[0] * arr[1];
		} else if ((arr[0] != arr[1]) && (arr[1] != arr[2]) && (arr[2] != arr[3])) {
			answer = arr[0];
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.solution(2, 2, 2, 2));
		System.out.println(s.solution(4, 1, 4, 4));
		System.out.println(s.solution(6, 3, 3, 6));
		System.out.println(s.solution(2, 5, 2, 6));
		System.out.println(s.solution(6, 4, 2, 5));

	}
}