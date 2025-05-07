package day_14;

import java.util.Arrays;

class Solution3 {
	public String[] solution(String[] todo_list, boolean[] finished) {
		int count = 0;
		for(boolean f : finished) {
			if(!f) count++;
		}
		String[] answer = new String[count];
		int idx = 0;
		for(int i=0; i<todo_list.length; i++) {
			if(!finished[i]) {
				answer[idx++] = todo_list[i];
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(Arrays.toString(s.solution(new String[] { "problemsolving", "practiceguitar", "swim", "studygraph" },
				new boolean[] { true, false, true, false })));
	}
}