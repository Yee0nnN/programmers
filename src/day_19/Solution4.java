package day_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution4 {
	public int[] solution(int[] arr) {
		List<Integer> answer = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (answer.isEmpty()) {
				answer.add(arr[i]);
			} else if (!answer.isEmpty() && answer.get(answer.size() - 1) == arr[i]) {
				answer.remove(answer.size() - 1);
			} else if (!answer.isEmpty() && answer.get(answer.size() - 1) != arr[i]) {
				answer.add(arr[i]);
			}
		}
		if (answer.isEmpty()) {
			return new int[] { -1 };
		}
		int[] result = new int[answer.size()];

		for (int i = 0; i < answer.size(); i++) {
			result[i] = answer.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(Arrays.toString(s.solution(new int[] { 0, 1, 1, 1, 0 })));
		System.out.println(Arrays.toString(s.solution(new int[] { 0, 1, 0, 1, 0 })));
		System.out.println(Arrays.toString(s.solution(new int[] { 0, 1, 1, 0 })));
	}
}
