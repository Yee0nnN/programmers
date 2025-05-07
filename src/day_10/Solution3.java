package day_10;

//03.문자열 뒤집기
class Solution3 {
	public String solution(String my_string, int s, int e) {
		String answer = "";
		String before = my_string.substring(0, s);
		String reverse = my_string.substring(s, e + 1);
		String after = my_string.substring(e + 1);

		String r = "";
		for (int i = reverse.length() - 1; i >= 0; i--) {
			r += reverse.charAt(i);
		}

		return answer = before + r + after;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.solution("Progra21Sremm3", 6, 12));
		System.out.println(s.solution("Stanley1yelnatS", 4, 10));
	}
}
