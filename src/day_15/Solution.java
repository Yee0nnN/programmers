package day_15;

import java.util.Arrays;

class Solution {
	public int[] solution(int[] arr) {
		int[] answer = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 50 && arr[i] % 2 == 0) {
				answer[i] = arr[i] / 2;
			} else if (arr[i] < 50 && arr[i] % 2 != 0) {
				answer[i] = arr[i] * 2;
			} else {
				answer[i] = arr[i];
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution(new int[] {1, 2, 3, 100, 99, 98})));
	}
}