package day_14;

class Solution {
	public int solution(int[] num_list) {
		int answer = 0;
		int even = 0;
		int odd = 0;
		for (int i = 0; i < num_list.length; i++) {
			if (i % 2 == 0){  //짝수
				even += num_list[i];
			} else {  //홀수 
				odd += num_list[i];
			}
		}
		answer = Math.max(even, odd);

		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[] { 4, 2, 6, 1, 7, 6 }));
	}
}
