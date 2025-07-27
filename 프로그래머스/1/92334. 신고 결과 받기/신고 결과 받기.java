import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		Map<String, Integer> idxMap = new HashMap<>();

		// 신고 목록
		Map<String, HashSet<String>> reportMap = new HashMap<>();

		for (int i = 0; i < id_list.length; i++) {
			idxMap.put(id_list[i], i);
		}

		// 중복 제거
		Set<String> reportSet = new HashSet<>(Arrays.asList(report));

		for (String r : reportSet) {
			String[] s = r.split(" ");
			String id = s[0];
			String reportId = s[1];

			if (!reportMap.containsKey(reportId))
				reportMap.put(reportId, new HashSet<>());
			reportMap.get(reportId).add(id);
		}

		for (String reported : reportMap.keySet()) {
			Set<String> reporters = reportMap.get(reported);
			if (reporters.size() >= k) {
				for (String reporter : reporters)
					answer[idxMap.get(reporter)]++;

			}
		}
		return answer;
	}
}