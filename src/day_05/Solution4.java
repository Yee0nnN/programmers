package day_05;

//04.원소들의 곱과 합
class Solution4 {
    public int solution(int[] num_list) {
        int answer = 0;
        int add = 0;
        int mul = 1;
        
        for(int i : num_list) {
        	add += i;
        	mul *= i;
        }
        
        answer = mul < (add*add) ? 1 : 0;
        
        return answer;
    }
    
    public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(s.solution(new int[]{3, 4, 5, 2, 1}));
		System.out.println(s.solution(new int[]{5, 7, 8, 3}));
	}
}

