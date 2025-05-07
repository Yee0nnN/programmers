package day_22;

class Solution5 {
	public int solution(String my_string, String target) {
		int answer = 0;
		return answer = my_string.contains(target) ? 1 : 0;
	}

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		System.out.println(s.solution("banana", "ana"));
		System.out.println(s.solution("banana", "wxyz"));
	}
}
