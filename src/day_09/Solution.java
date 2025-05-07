package day_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//01.배열 만들기 5 
class Solution {
	public int[] solution(String[] intStrs, int k, int s, int l) {

		List<Integer> ret = new ArrayList<>();

		for (String str : intStrs) {
			int num = Integer.parseInt(str.substring(s, s + l));

			if (num > k) {
				ret.add(num);
			}
		}

		return ret.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] result = s.solution(new String[] { "0123456789", "9876543210", "9999999999999" }, 50000, 5, 5);
		System.out.println(Arrays.toString(result));
	}
}
