class Solution {
	public String solution(String my_string, int num1, int num2) {
		String answer = "";
		char[] ch = my_string.toCharArray();
		char tmp = ch[num1];
		ch[num1] = ch[num2];
		ch[num2] = tmp;
		answer = new String(ch);
		return answer;
	}
}