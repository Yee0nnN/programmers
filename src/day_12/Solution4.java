package day_12;

import java.util.Arrays;

class Solution4 {
	public int[] solution(int[] arr) {
		int[] answer = {};
		int start = -1;
		int end = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				start = i;
				break;
			}
		}
		
		if (start == -1) {
			return new int[] { -1 };
		}

		for (int i = arr.length -1; i >= start; i--) {
			if (arr[i] == 2) {
				end = i;
				break;
			}
		}
		
		answer = new int[end - start + 1];
		
		int idx = 0;
		
		for (int i = start; i <= end; i++) {
			answer[idx++] = arr[i];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(Arrays.toString(s.solution(new int[] { 1, 2, 1, 4, 5, 2, 9 })));
		System.out.println(Arrays.toString(s.solution(new int[] { 1, 1, 1 })));
	}
}
