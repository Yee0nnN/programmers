package day_03;

//05.두 수의 연산값 비교하기
class Solution5 {
	public int solution(int a, int b) {
		int result = 0;

		String ab = String.valueOf(a) + String.valueOf(b);

		int i = Integer.parseInt(ab);
		int j = 2 * a * b;

		if (i >= j) {
			result = i;
		} else {
			result = j;
		}

		return result;
	}

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		System.out.println(s.solution(2, 91));
		System.out.println(s.solution(91, 2));
	}
}