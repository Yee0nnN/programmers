package day_03;

//02.문자 리스트를 문자열로 변환하기
class Solution2 {
	public String solution(String[] arr) {
		String result = "";

		for (String s : arr) {
			result += s;
		}
		return result;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.solution(new String[] { "a", "b", "c" }));
	}
}