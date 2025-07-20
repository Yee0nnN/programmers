import java.util.HashMap;
import java.util.Map;

class Solution {
	public int[] solution(String[] park, String[] routes) {
		int[] answer = new int[2];
		int row = park.length;
		int col = park[0].length();

		int x = 0;
		int y = 0;

		// 시작 위치
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (park[i].charAt(j) == 'S') {
					x = i;
					y = j;
					break;
				}
			}
		}

		Map<String, int[]> wayMap = new HashMap<>();
		wayMap.put("N", new int[] { -1, 0 });
		wayMap.put("S", new int[] { 1, 0 });
		wayMap.put("W", new int[] { 0, -1 });
		wayMap.put("E", new int[] { 0, 1 });

		for (String r : routes) {
			String[] route = r.split(" ");
			String way = route[0];
			int move = Integer.parseInt(route[1]);

			boolean isMove = true;

			int xMove = x;
			int yMove = y;

			for (int i = 1; i <= move; i++) {
				xMove += wayMap.get(way)[0];
				yMove += wayMap.get(way)[1];

				if (xMove < 0 || yMove < 0 || xMove >= row || yMove >= col || park[xMove].charAt(yMove) == 'X') {
					isMove = false;
					break;
				}
			}

			if (isMove) {
				x = xMove;
				y = yMove;
			}
		}
        answer[0] = x;
		answer[1] = y;
		return answer;
	}
}