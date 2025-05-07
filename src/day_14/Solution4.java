package day_14;

class Solution4 {
	public int solution(int[] numbers, int n) {
		int answer = 0;
		for (int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
			if (n < answer) {
				break;
			} else {
				continue;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(s.solution(new int[] { 34, 5, 71, 29, 100, 34 }, 123));
	}
}
