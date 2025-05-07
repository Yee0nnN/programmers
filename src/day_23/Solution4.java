package day_23;

class Solution4 {
	public int solution(int a, int b) {
		int answer = 0;
		if (a % 2 == 0 && b % 2 == 0) {
			answer = Math.abs(a - b);
		} else if (a % 2 != 0 && b % 2 != 0) {
			answer = a * a + b * b;
		} else {
			answer = 2 * (a + b);
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(s.solution(3, 5));
		System.out.println(s.solution(6, 1));
		System.out.println(s.solution(2, 4));
	}
}