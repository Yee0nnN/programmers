class Solution {
	public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		int idx = 0;
		for (int i = 0; i < quiz.length; i++) {
			String[] str = quiz[i].split(" ");

			String op = str[1];
			int num1 = Integer.parseInt(str[0]);
			int num2 = Integer.parseInt(str[2]);
			int result = Integer.parseInt(str[4]);
			if (op.equals("-")) {
				answer[idx++] = (num1 - num2 == result) ? "O" : "X";
			} else {
				answer[idx++] = (num1 + num2 == result) ? "O" : "X";
			}
		}

		return answer;
	}
}