package day_20;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int idx = 1;
        while(idx < arr.length) {
        	idx *= 2;
        }
        arr = Arrays.copyOf(arr, idx);
        return arr;
    }
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution(new int[] { 1, 2, 3, 4, 5, 6 })));
		System.out.println(Arrays.toString(s.solution(new int[] { 58, 172, 746, 89 })));

	}
    
}
