class Solution {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		double[] failRates = new double[N + 2];
		int totalCount = stages.length;

		for (int i = 1; i <= N + 1; i++) {
			int failCount = 0;
			for (int stage : stages) {
				if (stage == i) {
					failCount++;
				}
			}

			if (totalCount == 0) {
				failRates[i] = 0;
			} else {
				failRates[i] = (double) failCount / totalCount;
			}
			totalCount -= failCount; // 다음 스테이지로 넘어간 사람들
		}

		int[] stageNum = new int[N];
		for (int i = 0; i < N; i++) {
			stageNum[i] = i + 1;
		}

		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < N - i - 1; j++) {

				if (failRates[stageNum[j]] < failRates[stageNum[j + 1]]
						|| failRates[stageNum[j]] == failRates[stageNum[j + 1]] && stageNum[j] > stageNum[j + 1]) {
					int temp = stageNum[j];
					stageNum[j] = stageNum[j + 1];
					stageNum[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			answer[i] = stageNum[i];
		}

		return answer;
	}
}