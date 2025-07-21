import java.util.HashMap;
import java.util.Map;

class Solution {
	public int[] solution(String s) {
		int[] answer = new int[s.length()];
		Map<Character, Integer> sMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!sMap.containsKey(s.charAt(i))) {
				answer[i] = -1;
				sMap.put(s.charAt(i), i);
			} else {
				answer[i] = i - sMap.get(s.charAt(i));
				sMap.put(s.charAt(i), i);
			}
		}
		return answer;
	}
}