package day_10;

//02.접두사인지 확인하기
class Solution2 {
	public int solution(String my_string, String is_prefix) {
		int answer = my_string.startsWith(is_prefix) ? 1 : 0;

		return answer;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.solution("banana", "ban"));
		System.out.println(s.solution("banana", "nan"));
		System.out.println(s.solution("banana", "abcd"));
		System.out.println(s.solution("banana", "bananan"));
	}
}
