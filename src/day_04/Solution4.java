package day_04;

//04.조건 문자열
class Solution4 {
	public int solution(String ineq, String eq, int n, int m) {
		int answer = 0;

		if (ineq.equals(">") && eq.equals("=")) {
			return answer = (n >= m) ? 1 : 0;
		}

		else if (ineq.equals("<") && eq.equals("=")) {
			return answer = (n <= m) ? 1 : 0;
		}

		else if (ineq.equals(">") && eq.equals("!")) {
			return answer = (n > m) ? 1 : 0;
		}

		else if (ineq.equals("<") && eq.equals("!")) {
			return answer = (n < m) ? 1 : 0;
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(s.solution("<", "=", 20, 50));
		System.out.println(s.solution(">", "!", 41, 78));
	}
}