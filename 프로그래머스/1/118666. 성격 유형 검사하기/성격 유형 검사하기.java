import java.util.HashMap;

class Solution {
	public String solution(String[] survey, int[] choices) {
		String answer = "";

		char[] type = { 'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N' };

		HashMap<Character, Integer> test = new HashMap<>();
		
        for (char c : type) {
			test.put(c, 0);
		}

        // 4 기준으로 점수
		for (int i = 0; i < survey.length; i++) {
			char[] c = survey[i].toCharArray();

			if (choices[i] > 4) {
				int num = test.get(c[1]);
				test.put(c[1], num + choices[i] - 4);
			} else if (choices[i] < 4) {
				int num = test.get(c[0]);
				test.put(c[0], num + 4 - choices[i]);
			}
		}

        // 하나 선택
		for (int i = 0; i < type.length; i += 2) {
			if (test.get(type[i]) > test.get(type[i + 1])) {
				answer += type[i];
			} else if (test.get(type[i]) < test.get(type[i + 1])) {
				answer += type[i + 1];
			} else {
				answer += type[i];
			}
		}

		return answer;
	}
}