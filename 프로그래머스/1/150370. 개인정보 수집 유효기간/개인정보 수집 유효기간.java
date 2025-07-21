import java.util.HashMap;
import java.util.Map;

class Solution {
	public int[] solution(String today, String[] terms, String[] privacies) {
		int[] answer = {};
		Map<String, Integer> termsMap = new HashMap<>();
		int date = f_date(today);
		int count = 0;
		int idx = 0;

		for (String t : terms) {
			String[] term = t.split(" ");
			termsMap.put(term[0], Integer.parseInt(term[1]));
		}

		for (int i = 0; i < privacies.length; i++) {
			String[] p = privacies[i].split(" ");

			if (f_date(p[0]) + (termsMap.get(p[1]) * 28) <= date) {
				count++;
			}
		}

		answer = new int[count];
		for (int i = 0; i < privacies.length; i++) {
			String[] p = privacies[i].split(" ");

			if (f_date(p[0]) + (termsMap.get(p[1]) * 28) <= date) {
				answer[idx++] = i + 1;
			}
		}

		return answer;
	}

	private int f_date(String date) {
		String[] dateArray = date.split("\\.");
		int year = Integer.parseInt(dateArray[0]);
		int month = Integer.parseInt(dateArray[1]);
		int day = Integer.parseInt(dateArray[2]);
		return year * 12 * 28 + month * 28 + day;
	}
}