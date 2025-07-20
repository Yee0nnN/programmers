import java.util.HashMap;
import java.util.Map;

class Solution {
	public String[] solution(String[] players, String[] callings) {

		Map<String, Integer> idxMap = new HashMap<>();

		for (int i = 0; i < players.length; i++) {
			idxMap.put(players[i], i);
		}

		for (String name : callings) {
			int idx = idxMap.get(name);
			int frontIdx = idx - 1;

			String frontName = players[frontIdx];

			players[frontIdx] = name;
			players[idx] = frontName;

			idxMap.put(name, frontIdx);
			idxMap.put(frontName, idx);
		}
		return players;
	}
}