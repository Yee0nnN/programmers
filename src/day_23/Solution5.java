package day_23;

class Solution5 {
	public int solution(int[] date1, int[] date2) {
		int answer = 0;
		for (int i = 0; i < 3; i++) {
			if (date1[i] < date2[i]) {
				answer = 1;
				break;
			}
			if (date1[i] > date2[i]) {
				answer = 0;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		System.out.println(s.solution(new int[] { 2021, 12, 28 }, new int[] { 2021, 12, 29 }));
		System.out.println(s.solution(new int[] { 1024, 10, 24 }, new int[] { 1024, 10, 24 }));
		System.out.println(s.solution(new int[] { 1024, 12, 31 }, new int[] { 1025, 01, 01 }));

	}
}