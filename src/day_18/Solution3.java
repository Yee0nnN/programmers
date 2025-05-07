package day_18;

class Solution3 {
	public int solution(String binomial) {
		int answer = 0;
		String[] str = binomial.split(" ");
		int num1 = Integer.parseInt(str[0]);
		int num2 = Integer.parseInt(str[2]);

		String op = str[1];

		if (op.equals("+")) {
			answer = num1 + num2;
		}
		if (op.equals("-")) {
			answer = num1 - num2;
		}
		if (op.equals("*")) {
			answer = num1 * num2;
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.solution("43 + 12"));
		System.out.println(s.solution("0 - 7777"));
		System.out.println(s.solution("40000 * 40000"));
	}
}
