package day_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution3 {
	public int[] solution(int[] arr, boolean[] flag) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (flag[i]) {
				int num = arr[i];
				for (int j = 0; j < num * 2; j++) {
					list.add(num);
				}
			} else {
				for (int j = 0; j < arr[i]; j++) {
					list.remove(list.size() - 1);

				}
			}
		}

		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}

		return result;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(Arrays
				.toString(s.solution(new int[] { 3, 2, 4, 1, 3 }, new boolean[] { true, false, true, false, false })));
	}
}
