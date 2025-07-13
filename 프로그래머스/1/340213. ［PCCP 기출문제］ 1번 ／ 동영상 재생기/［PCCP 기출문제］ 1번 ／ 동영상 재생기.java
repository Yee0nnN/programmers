class Solution {
	// 초(int)로 변환하는 함수
	private int timeToSeconds(String time) {
		String[] times = time.split(":");
		int minutes = Integer.parseInt(times[0]);
		int seconds = Integer.parseInt(times[1]);
		return minutes * 60 + seconds;
	}

	public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
		String answer = "";
		int videoLen = timeToSeconds(video_len);
		int posLen = timeToSeconds(pos);
		int opStartLen = timeToSeconds(op_start);
		int opEndLen = timeToSeconds(op_end);

		for (String cmd : commands) {
			// 명령 전 오프닝 구간
			if (posLen >= opStartLen && posLen <= opEndLen) {
				posLen = opEndLen;
			}

			if (cmd.equals("prev")) {
				posLen = Math.max(0, posLen - 10);
			} else if (cmd.equals("next")) {
				posLen = Math.min(videoLen, posLen + 10);
			}

			// 명령 후 오프닝 구간
			if (posLen >= opStartLen && posLen <= opEndLen) {
				posLen = opEndLen;
			}
		}

		answer = String.format("%02d:%02d", posLen / 60, posLen % 60);
		return answer;
	}
}