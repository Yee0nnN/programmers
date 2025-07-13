class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < schedules.length; i++) {
            
            // 희망 출근 시각을 분 단위로 계산
            int time = (schedules[i] / 100) * 60 + (schedules[i] % 100);

            boolean isLate = false;

            for (int j = 0; j < 7; j++) {
                int day = (startday + j) % 7;

                if (day >= 1 && day <= 5) {
                 
                    int logTime = (timelogs[i][j] / 100) * 60 + (timelogs[i][j] % 100);

                    if (logTime > time + 10) {
                        isLate = true;
                        break;
                    }
                }
            }

            if (!isLate) {
                answer++;
            }
        }

        return answer;
    }
}