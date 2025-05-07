package day_03;

//03.문자열 곱하기
class Solution3 {
	public String solution(String my_string, int k) {
		String result = "";
		for (int i = 0; i < k; i++) {
			result += my_string;
		}
		return result;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.solution("string", 3));
		System.out.println(s.solution("love", 10));
	}
}
