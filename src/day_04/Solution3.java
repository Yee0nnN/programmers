package day_04;

//03.홀짝에 따라 다른 값 반환하기
class Solution3 {
	public int solution(int n) {
		int answer = 0;

		if (n % 2 != 0) {
			for (int i = n; i > 0; i -= 2) {
				answer += i;
			}
		} else {
			for (int i = n; i > 0; i -= 2) {
				answer += i * i;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.solution(7));
		System.out.println(s.solution(10));
	}
}
