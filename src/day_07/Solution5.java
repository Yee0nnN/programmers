package day_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//05.배열 만들기 4
class Solution5 {
	public int[] solution(int[] arr) {
		List<Integer> stk = new ArrayList<>();
		int i = 0;
		
		while(i<arr.length) {
			if (stk.isEmpty()) {
				stk.add(arr[i]);
				i++;
			} else if (stk.get(stk.size()-1) < arr[i]) {
				stk.add(arr[i]);
				i++;
			} else {
				stk.remove(stk.size()-1);
			}
		}
		return stk.stream().mapToInt(Integer::intValue).toArray();
	
	}
	
	public static void main(String[] args) {
		Solution5 s = new Solution5();
		int[] result = s.solution(new int[] {1,4,2,5,3});
		System.out.println(Arrays.toString(result));
		
	}
}