package day_09;

//02.부분 문자열 이어붙여 문자열 만들기
class Solution2 {
	public String solution(String[] my_strings, int[][] parts) {
		String answer = "";

		for (int i = 0; i < parts.length; i++) {
			String str = my_strings[i];

			answer += str.substring(parts[i][0], parts[i][1] + 1);
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();

		String result = s.solution(new String[] { "progressive", "hamburger", "hammer", "ahocorasick" },
				new int[][] { { 0, 4 }, { 1, 2 }, { 3, 5 }, { 7, 7 } });

		System.out.println(result);
	}
}
