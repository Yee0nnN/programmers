class Solution {
	public String solution(String my_string) {
		String answer = "";
		String[] str = my_string.split("");
		for (int i = 0; i < str.length; i++) {
			boolean isDu = false;
			for (int j = 0; j < i; j++) {
				if (str[i].equals(str[j])) {
					isDu = true;
					break;
				}
			}
			if (!isDu) {
				answer += str[i];
			}
		}
		return answer;
	}
}
