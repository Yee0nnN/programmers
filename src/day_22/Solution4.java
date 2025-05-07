package day_22;

import java.util.Arrays;

class Solution4 {
	public int[] solution(int[] arr, int[] delete_list) {
		int[] answer = new int[arr.length];
		int idx = 0;
		for(int i=0; i<arr.length; i++) {
			boolean delete = false;
			for(int j=0; j<delete_list.length; j++) {
				if(arr[i] == delete_list[j]) {
					delete = true;
					break;
				}
			}
			if(!delete) {
				answer[idx++] = arr[i];
			}
		}
		answer = Arrays.copyOf(answer, idx);
		return answer;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(Arrays.toString(s.solution(new int[] {293, 1000, 395, 678, 94}, new int[] {94, 777, 104, 1000, 1, 12})));
	}
}
