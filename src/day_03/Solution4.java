package day_03;

//04.더 크게 합치기
class Solution4 {
	public int solution(int a, int b) {
		int result = 0;
		String ab = String.valueOf(a) + String.valueOf(b);
		String ba = String.valueOf(b) + String.valueOf(a);

		int i = Integer.parseInt(ab);
		int j = Integer.parseInt(ba);

		if (i >= j) {
			result = i;
		} else {
			result = j;
		}

		return result;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(s.solution(9, 91));
		System.out.println(s.solution(89, 8));
	}
}