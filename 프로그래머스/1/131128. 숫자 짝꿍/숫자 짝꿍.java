import java.util.ArrayList;
import java.util.List;

class Solution {
	public String solution(String X, String Y) {
		String answer = "";
        List<String> result = new ArrayList<>();
        
        // 0~9 빈도 -> 항상 10
		int[] numX = new int[10];
		int[] numY = new int[10];

		// 숫자 변환
		for (char c : X.toCharArray()) {
			numX[c - '0']++;
		}

		for (char c : Y.toCharArray()) {
			numY[c - '0']++;
		}

		for (int i = 9; i >= 0; i--) {
			int comm = Math.min(numX[i], numY[i]); // 공통 숫자 개수

			for (int j = 0; j < comm; j++) {
				result.add(String.valueOf(i));
			}
		}

		if (result.isEmpty())
			return "-1";

		if (result.get(0).equals("0"))
			return "0";
        
        answer = String.join("", result);

		return answer;
	}
}