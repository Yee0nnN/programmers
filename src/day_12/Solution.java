package day_12;

import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        
        switch(n) {
        //잘라서 새 배열로 만들어줌
        case 1 -> { answer = Arrays.copyOfRange(num_list, 0, b+1);}
        //length는  +1 안해줘도 됨 
        case 2 -> { answer = Arrays.copyOfRange(num_list, a, num_list.length);}
        case 3 -> { answer = Arrays.copyOfRange(num_list, a, b+1);}
        case 4 -> { 
        	int size = ((b-a)/c) + 1;
        	answer = new int[size];
        	int idx = 0;
        	for(int i=a; i<=b; i+=c) {
        		answer[idx++] = num_list[i];}}
        }
        
        return answer;
    }
    
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution(3, new int[] {1,5,2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9})));
		System.out.println(Arrays.toString(s.solution(4, new int[] {1,5,2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9})));
		System.out.println(Arrays.toString(s.solution(2, new int[] {1,5,2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9})));
	}
}
