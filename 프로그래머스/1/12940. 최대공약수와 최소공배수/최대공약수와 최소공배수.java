class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = n;
        int b = m;

        // 최대공약수
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        answer[0] = a;

        // 최소공배수
        answer[1] = (int) (n / answer[0] * m);

        return answer;
    }
}