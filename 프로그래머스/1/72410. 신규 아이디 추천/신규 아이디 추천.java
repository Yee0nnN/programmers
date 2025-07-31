class Solution {
	public String solution(String new_id) {
		String answer = "";

		answer = new_id.toLowerCase();

		answer = answer.replaceAll("[^a-z0-9-_.]", "");

		while (answer.contains("..")) {
			answer = answer.replace("..", ".");
		}

		answer = answer.replaceAll("^\\.|\\.$", "");

		if (answer.length() == 0) {
			answer = "a";
		}

		if (answer.length() > 15) {
			answer = answer.substring(0, 15);
			if (answer.charAt(answer.length() - 1) == '.') {
				answer = answer.substring(0, answer.length() - 1);
			}
		}

		while (answer.length() < 3) {
			answer += answer.charAt(answer.length() - 1);
		}

		return answer;
	}
}