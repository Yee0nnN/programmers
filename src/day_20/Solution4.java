package day_20;

import java.util.Arrays;

class Solution4 {
	public int[] solution(int[] arr, int n) {
		int num = (arr.length % 2 == 0) ? 1 : 0;
		for(int i = num; i<arr.length; i+=2) {
			arr[i] += n;
		}
		return arr;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(Arrays.toString(s.solution(new int[] { 49, 12, 100, 276, 33 }, 27)));
		System.out.println(Arrays.toString(s.solution(new int[] { 444, 555, 666, 777 }, 100)));

	}
}
