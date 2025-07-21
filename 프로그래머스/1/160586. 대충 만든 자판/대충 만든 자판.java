import java.util.HashMap;
import java.util.Map;

class Solution {
	public int[] solution(String[] keymap, String[] targets) {
		int[] answer = new int[targets.length];
		Map<Character, Integer> keyMap = new HashMap<>();

		for (int i = 0; i < keymap.length; i++) {
			for (int j = 0; j < keymap[i].length(); j++) {
				char c = keymap[i].charAt(j);
				if (keyMap.containsKey(c)) {
					int idx = keyMap.get(c);
					keyMap.put(c, Math.min(idx, j + 1));
				} else {
					keyMap.put(c, j + 1);
				}
			}
		}

		for (int i = 0; i < targets.length; i++) {
			for (int j = 0; j < targets[i].length(); j++) {
				char c = targets[i].charAt(j);
				if (keyMap.containsKey(c)) {
					answer[i] += keyMap.get(c);
				} else {
					answer[i] = -1;
					break;
				}
			}
		}

		return answer;
	}
}