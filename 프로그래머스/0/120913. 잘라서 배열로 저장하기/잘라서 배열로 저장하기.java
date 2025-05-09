class Solution {
	public String[] solution(String my_str, int n) {
		int size = (my_str.length() + n - 1) / n;
		String[] answer = new String[size];

		int idx = 0;
		for (int i = 0; i < my_str.length(); i += n) {
			int end = Math.min(i + n, my_str.length());
			answer[idx++] = my_str.substring(i, end);
		}
		return answer;
	}
}
