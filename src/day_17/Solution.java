package day_17;

class Solution {
	public String solution(String myString, String pat) {
		int idx = myString.lastIndexOf(pat);
		return myString.substring(0, idx + pat.length());
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("AbCdEFG", "dE"));
		System.out.println(s.solution("AAAAaaaa", "a"));
	}
}
