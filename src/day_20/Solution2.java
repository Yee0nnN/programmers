package day_20;

class Solution2 {
	public int solution(int[] arr1, int[] arr2) {
		int answer = 0;
		int sum1 = 0, sum2 = 0;

		if (arr1.length != arr2.length) {
			answer = (arr1.length > arr2.length) ? 1 : -1;
		} else if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				sum1 += arr1[i];
				sum2 += arr2[i];
			}
			if (sum1 != sum2) {
				answer = (sum1 > sum2) ? 1 : -1;
			} else if (sum1 == sum2) {
				answer = 0;
			}

		}

		return answer;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.solution(new int[] { 49, 13 }, new int[] { 70, 11, 2 }));
		System.out.println(s.solution(new int[] { 100, 17, 84, 1 }, new int[] { 55, 12, 65, 36 }));

	}
}
