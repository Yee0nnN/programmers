package day_03;

//01.문자열 섞기
class Solution {
	public String solution(String str1, String str2) {
		String result = "";
		for (int i = 0; i < str1.length(); i++) {
			result += str1.charAt(i);
			result += str2.charAt(i);
		}
		return result;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("aaaaa", "bbbbb"));
	}
}

