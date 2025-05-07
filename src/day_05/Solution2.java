package day_05;

//02.등차수열의 특정한 항만 더하기
class Solution2 {
	public int solution(int a, int d, boolean[] included) {
		int answer = 0;
		for (int i = 0; i < included.length; i++) {
			if (included[i] == true) {
				answer += (a + (d * i));
			}
		}

		return answer;
	}
	
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.solution(3, 4, new boolean[] {true, false, false, true, true}));
		System.out.println(s.solution(7, 1, new boolean[] {false, false, false, true, false, false, false}));
	}
}

