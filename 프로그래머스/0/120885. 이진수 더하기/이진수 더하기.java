class Solution {
	public String solution(String bin1, String bin2) {
		String answer = "";
		// 2진수로 해석해서 10진수로 변환
		int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
		return answer = Integer.toBinaryString(sum);
	}
}
