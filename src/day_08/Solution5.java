package day_08;

//05.문자열 여러 번 뒤집기 
class Solution5 {
	public String solution(String my_string, int[][] queries) {
		String answer = "";

		char[] arr = my_string.toCharArray();

		for (int q = 0; q < queries.length; q++) {
			int s = queries[q][0];
			int e = queries[q][1];

			while (s < e) {
				char temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				s++;
				e--;
			}
		}
		answer = new String(arr);

		return answer;
	}

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		String result = s.solution("rermgorpsam", new int[][] { { 2, 3 }, { 0, 7 }, { 5, 9 }, { 6, 10 } });
		System.out.println(result);
	}
}