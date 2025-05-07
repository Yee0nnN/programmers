package day_10;

//01.문자열의 앞의 n글자
class Solution {
	public String solution(String my_string, int n) {
		String answer = "";
		answer = my_string.substring(0, n);

		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("ProgrammerS123", 11));
		System.out.println(s.solution("He110W0r1d", 5));
	}
}
