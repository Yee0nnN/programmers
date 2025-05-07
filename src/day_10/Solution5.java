package day_10;

//05.qr code
class Solution5 {
	public String solution(int q, int r, String code) {
		String answer = "";
		for (int i = 0; i < code.length(); i++) {
			if (i % q == r) {
				answer += code.charAt(i);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		System.out.println(s.solution(3, 1, "qjnwezgrpirldywt"));
		System.out.println(s.solution(1, 0, "programmers"));

	}
}