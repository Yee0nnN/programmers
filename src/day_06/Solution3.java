package day_06;

//03.수 조작하기 2
class Solution3 {
	public String solution(int[] numLog) {
		String answer = "";

		for (int i = 1; i < numLog.length; i++) {
			int min = numLog[i] - numLog[i - 1];

			switch (min) {
			case 1 -> answer += "w";
			case -1 -> answer += "s";
			case 10 -> answer += "d";
			case -10 -> answer += "a";
			}

		}

		return answer;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.solution(new int[] { 0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1 }));
	}
}
