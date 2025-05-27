class Solution {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];
		int pa = denom1 * denom2;
		int ch = numer1 * denom2 + numer2 * denom1;
		int min = Math.min(pa, ch);

		int num = 1;
		for (int i = min; i > 0; i--) {
			if (pa % i == 0 && ch % i == 0) {
				num = i;
				break;
			}
		}
		answer[0] = ch / num;
		answer[1] = pa / num;
		return answer;
	}
}
