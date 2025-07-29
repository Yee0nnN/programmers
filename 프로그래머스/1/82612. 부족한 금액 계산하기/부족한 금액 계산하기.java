class Solution {
	public long solution(int price, int money, int count) {
		long answer = 0;
		long num = 0;

		for (int i = 1; i <= count; i++) {
			num += price * i;
		}

		answer = num - money;

		return (answer > 0) ? answer : 0;
	}
}