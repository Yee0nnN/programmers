import java.util.Arrays;

class Solution {
	public int solution(int[] mats, String[][] park) {
		int answer = -1;
		int size = 0;

		Arrays.sort(mats);
		for (int i = mats.length - 1; i >= 0; i--) {
			size = mats[i];

			for (int j = 0; j <= park.length - size; j++) {
				for (int k = 0; k <= park[0].length - size; k++) {
					boolean isPlace = true;

					for (int x = 0; x < size; x++) {
						for (int y = 0; y < size; y++) {
							if (!park[j + x][k + y].equals("-1")) {
								isPlace = false;
								break;
							}

						}
						if (!isPlace)
							break;
					}
					if (isPlace)
						return answer = size;
				}
			}

		}
		return answer;
	}
}
