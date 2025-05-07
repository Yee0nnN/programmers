package day_07;

import java.util.Arrays;


//03.카운트업
class Solution3 {
	public int[] solution(int start_num, int end_num) {
		int size = end_num - start_num + 1;
		int[] answer = new int[size];

		for (int i = 0; i < size; i++) {
			answer[i] = start_num + i;
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		int[] result = s.solution(3, 10);
		System.out.println(Arrays.toString(result));
	}
}