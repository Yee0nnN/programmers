package day_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
	public int solution(int[] rank, boolean[] attendance) {
		int answer = 0;
		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (rank[j] == i && attendance[j] == true) {
					list.add(j);
					if (list.size() == 3)
						break;
				}
			}
			if (list.size() == 3)
				break;
		}

		answer = 10000 * list.get(0) + 100 * list.get(1) + list.get(2);

		return answer;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.solution(new int[] { 3, 7, 2, 5, 4, 6, 1 },
				new boolean[] { false, true, true, true, true, false, false }));
	}

}
