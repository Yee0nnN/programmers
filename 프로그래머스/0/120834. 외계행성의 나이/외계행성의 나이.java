class Solution {
	public String solution(int age) {
		String answer = "";

		String[] numArr = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
		String[] ageArr = Integer.toString(age).split("");

		for (int i = 0; i < ageArr.length; i++) {
			int num = Integer.parseInt(ageArr[i]);
			answer += numArr[num];
		}
		return answer;
	}
}
