package day_22;

class Solution {
	public String solution(String n_str) {
		String answer = "";
		for (int i = 0; i < n_str.length(); i++) {
			char ch = n_str.charAt(i);
			if (ch != '0') {
				answer = n_str.substring(i);
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("0010"));
		System.out.println(s.solution("854020"));
	}
}