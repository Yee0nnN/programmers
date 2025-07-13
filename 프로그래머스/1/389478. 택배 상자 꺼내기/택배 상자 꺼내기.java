class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
    
        //row
        int len = (num - 1) / w;
        
        //col
        int idx = (len % 2 == 0) ? ((num - 1) % w) : ((w - 1) - (num - 1) % w);
        
        for(int i = len; i < (n + w - 1) / w; i++) {
            int boxIdx = (i % 2 == 0) ? (idx + (i * w) + 1) : ((w - 1 - idx) + (i * w) + 1);
            if(boxIdx <= n) answer++;
        }
        return answer;
    }
}