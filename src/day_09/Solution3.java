package day_09;

//03.문자열의 뒤의 n글자
class Solution3 {
	public String solution(String my_string, int n) {
		String answer = "";
		answer = my_string.substring(my_string.length() - n);
		return answer;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.solution("ProgrammerS123", 11));
		System.out.println(s.solution("He110W0r1d", 5));
	}
}
