package day_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution5 {
	public int[] solution(int[] arr, int k) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (list.contains(arr[i])) {
				continue;
			} else if (!list.contains(arr[i]) && list.size() < k) {
				list.add(arr[i]);
			}
		}
		if (list.size() < k) {
			for (int i = list.size(); i < k; i++) {
				list.add(-1);
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		System.out.println(Arrays.toString(s.solution(new int[] { 0, 1, 1, 2, 2, 3 }, 3)));
		System.out.println(Arrays.toString(s.solution(new int[] { 0, 1, 1, 1, 1 }, 4)));

	}
}
