import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
		int[][] answer = {};
		
		Map<String, Integer> dataMap = new HashMap<>();
		dataMap.put("code", 0);
		dataMap.put("date", 1);
		dataMap.put("maximum", 2);
		dataMap.put("remain", 3);

		List<int[]> dataList = new ArrayList<>();
		for (int[] d : data) {
			if (d[dataMap.get(ext)] < val_ext) {
				dataList.add(d);
			}
		}

		// 정렬
		dataList.sort(Comparator.comparingInt(sortData -> sortData[dataMap.get(sort_by)]));

		// List -> int[][]
		answer = new int[dataList.size()][];
		for (int i = 0; i < dataList.size(); i++) {
			answer[i] = dataList.get(i);
		}
		return answer;
	}
}