package day_07;

import java.util.Arrays;

//02.배열 만들기 2
class Solution2 {
	public int[] solution(int l, int r) {
		int[] arr = new int[r - l + 1];
		int count = 0;

		for (int i = l; i <= r; i++) {
			String str = String.valueOf(i);
			boolean isValid = true;

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) != '5' && str.charAt(j) != '0') {
					isValid = false;
					break;
				}
			}

			if (isValid) {
				arr[count++] = i;
			}
		}

		if (count == 0) {
			return new int[] { -1 };
		}

		int[] answer = new int[count];
		for (int i = 0; i < count; i++) {
			answer[i] = arr[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(Arrays.toString(s.solution(5, 555)));
		System.out.println(Arrays.toString(s.solution(10, 20)));
	}
}