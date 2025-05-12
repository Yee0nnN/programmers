class Solution {
	public String solution(String my_string) {
		String answer = "";

		char[] ch = my_string.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (Character.isUpperCase(ch[i])) {
				ch[i] = Character.toLowerCase(ch[i]);
			} else {
				ch[i] = Character.toUpperCase(ch[i]);
			}
		}

		answer = new String(ch);
		return answer;
	}
}
