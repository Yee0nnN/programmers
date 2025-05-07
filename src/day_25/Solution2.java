package day_25;

class Solution2 {
	public int solution(int[][] arr) {
		int answer = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] != arr[j][i]) {
					answer = 0;
					return answer;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.solution(new int[][] { { 5, 192, 33 }, { 192, 72, 95 }, { 33, 95, 999 } }));
	}
}
