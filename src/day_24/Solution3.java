package day_24;

import java.util.Arrays;

class Solution3 {
	public int[] solution(int[] arr, int k) {
		int[] answer = new int[arr.length];
		if (k % 2 != 0) {
			for (int i = 0; i < arr.length; i++) {
				answer[i] = arr[i] * k;
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				answer[i] = arr[i] + k;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(Arrays.toString(s.solution(new int[] { 1, 2, 3, 100, 99, 98 }, 3)));
	}
}
