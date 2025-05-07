package day_23;

class Solution3 {
	public int solution(int[] num_list, int n) {
		int answer = 0;
		for (int i : num_list) {
			if (i == n) {
				answer = 1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.solution(new int[] { 1, 2, 3, 4, 5 }, 3));
	}
}
