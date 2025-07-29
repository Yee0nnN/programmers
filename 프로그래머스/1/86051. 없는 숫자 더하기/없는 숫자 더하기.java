class Solution {
	public int solution(int[] numbers) {
		int answer = 0;
        
		for (int num : numbers) {
			answer += num;
		}
        
		answer = 45 - answer;
		return answer;
	}
}