package day_24;

class Solution4 {
	public String solution(String myString) {
		String answer = "";
		for (int i = 0; i < myString.length(); i++) {
			char ch = myString.charAt(i);
			if (ch < 'l') {
				ch = 'l';
			}
			answer += ch;
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(s.solution("abcdevwxyz"));
	}
}
