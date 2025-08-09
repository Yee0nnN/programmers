class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            // 둘 중 하나라도 1이면 1, 둘 다 0이면 0
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = answer[i].replace('0', ' ');
            answer[i] = answer[i].replace('1', '#');

            while (answer[i].length() < n) {
                answer[i] = ' ' + answer[i];
            }
        }
        return answer;
    }
}