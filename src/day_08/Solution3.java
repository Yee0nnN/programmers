package day_08;

//03.글자 이어 붙여 문자열 만들기
class Solution3 {
	public String solution(String my_string, int[] index_list) {
		String answer = "";

		for (int i = 0; i < index_list.length; i++) {
			answer += my_string.charAt(index_list[i]);
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.solution("cvsgiorszzzmrpaqpe", new int[] { 16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7 }));
		System.out.println(s.solution("zpiaz", new int[] { 1, 2, 0, 0, 3 }));
	}
}
