package day_08;

//01.간단한 논리 연산
class Solution {
	public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
		boolean answer = true;
		
		answer = ((x1||x2) && (x3||x4));
		
		return answer;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(false, true, true, true));
		System.out.println(s.solution(true, false, false, false));
	}
}