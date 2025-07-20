import java.util.HashMap;
import java.util.Map;

class Solution {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
		Map<String, Integer> idxMap = new HashMap<>();

		for (int i = 0; i < name.length; i++) {
			idxMap.put(name[i], yearning[i]);
		}

		for (int i = 0; i < photo.length; i++) {
			for (int j = 0; j < photo[i].length; j++) {
				if (idxMap.containsKey(photo[i][j])) {
					answer[i] += idxMap.get(photo[i][j]);
				}
			}
		}

		return answer;
	}
}