class Solution {
	public String solution(String my_string) {
		String answer = "";
		for (int i = my_string.length() - 1; i > -1; i--) {
			char ch = my_string.charAt(i);
			answer += ch;
		}
		return answer;
	}
}