class Solution {
	public int[] solution(int[] numlist, int n) {
		int[] answer = {};

		for (int i = 0; i < numlist.length; i++) {
			for (int j = 0; j < numlist.length - 1 - i; j++) {
				if (Math.abs(numlist[j] - n) > Math.abs(numlist[j + 1] - n)
						|| (Math.abs(numlist[j] - n) == Math.abs(numlist[j + 1] - n) && numlist[j] < numlist[j + 1])) {
					int tmp = numlist[j];
					numlist[j] = numlist[j + 1];
					numlist[j + 1] = tmp;
				}

			}
		}
		answer = numlist;
		return answer;
	}
}
