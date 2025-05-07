package day_17;

import java.util.Arrays;

class Solution5 {
	public String[] solution(String my_string) {
		return my_string.trim().split("\\s+");
	}

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		System.out.println(Arrays.toString(s.solution(" i    love  you")));
	}
}
