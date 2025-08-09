class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    boolean isSosu = true;

                    for (int z = 2; z * z <= sum; z++) {
                        if (sum % z == 0) {
                            isSosu = false;
                            break;
                        }
                    }
                    if (isSosu) answer++;
                }
            }
        }

        return answer;
    }
}