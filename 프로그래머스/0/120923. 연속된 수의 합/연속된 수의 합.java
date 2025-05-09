class Solution {
	public int[] solution(int num, int total) {
		int[] answer = new int[num];
		
		//연속된 정수의 합 공식 이용 
		int first = ((2 * total / num) - (num - 1)) / 2;

		for (int i = 0; i < num; i++) {
			answer[i] = first;
			first++;
		}
		return answer;
	}
}
