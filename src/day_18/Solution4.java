package day_18;

class Solution4 {
	public int solution(String myString, String pat) {
		int answer = 0;
		char[] ch = myString.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'A') {
				ch[i] = 'B';
			} else if (ch[i] == 'B') {
				ch[i] = 'A';
			}
		}

		myString = new String(ch);
		if (myString.contains(pat)) {
			answer = 1;
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(s.solution("ABBAA", "AABB"));
		System.out.println(s.solution("ABAB", "ABAB"));
	}
}
