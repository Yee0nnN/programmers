package day_17;

class Solution2 {
	public int solution(String myString, String pat) {
		int answer = 0;

		for (int i = 0; i <= myString.length()-pat.length(); i++) {
			if (myString.substring(i, i + pat.length()).equals(pat)) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("banana", "ana"));
	}
}