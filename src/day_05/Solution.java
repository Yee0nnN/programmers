package day_05;

//01.코드 처리하기
class Solution {
	public String solution(String code) {
		String answer = "";
		int mode = 0;

		for (int idx = 0; idx < code.length(); idx++) {
			char ch = code.charAt(idx);
			switch (mode) {
			case (0) -> {
				if (ch != '1' && idx % 2 == 0) {
					answer += ch;
				} else if (ch == '1')
					mode = 1;
			}
			case (1) -> {
				if (ch != '1' && idx % 2 != 0) {
					answer += ch;
				} else if (ch == '1')
					mode = 0;
			}
			}
		}
		return answer.equals("") ? "EMPTY" : answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("abc1abc1abc"));
	}
}

