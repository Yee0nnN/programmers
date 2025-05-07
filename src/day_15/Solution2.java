package day_15;

import java.util.Arrays;

class Solution2 {
	public int solution(int[] arr) {
		int[] answer = Arrays.copyOf(arr, arr.length);
		int count = 0;

		while (true) {
			count++;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= 50 && arr[i] % 2 == 0) {
					arr[i] = arr[i] / 2;
				} else if (arr[i] < 50 && arr[i] % 2 != 0) {
					arr[i] = arr[i] * 2 + 1;
				} else {
					arr[i] = arr[i];
				}
			}

			if (Arrays.equals(answer, arr)) {
				break;
			}
			answer = Arrays.copyOf(arr, arr.length);
		}

		return count - 1;

	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.solution(new int[] { 1, 2, 3, 100, 99, 98 }));
	}
}