import java.util.ArrayList;
import java.util.Comparator;

class Solution {
	public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < score.length; i++) {
			list.add(score[i]);

			for (int j = list.size() - 1; j > 0; j--) {
				int pre = list.get(j - 1);
				int cur = list.get(j);
				if (cur < pre) {
					list.set(j, pre);
					list.set(j - 1, cur);
				}
			}
			if (list.size() > k) {
				list.remove(0);
			}
			answer[i] = list.get(0);
		}
		return answer;
	}
}