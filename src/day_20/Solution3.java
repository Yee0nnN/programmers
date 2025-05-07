package day_20;

class Solution3 {
	public int solution(String[] strArr) {
		int[] count = new int[30];
		for (int i = 0; i < strArr.length; i++) {
			int length = strArr[i].length() - 1;
			count[length]++;
		}
		int max = 0;
		for (int num : count) {
			max = Math.max(max, num);
		}
		return max;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.solution(new String[] { "a", "bc", "d", "efg", "hi" }));

	}
}