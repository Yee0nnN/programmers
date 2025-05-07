package day_19;

import java.util.Arrays;


class Solution2 {
    public int[] solution(int[] arr) {
    	int size = 0;
    	for(int i : arr) {
    		size += i;
    	}
        int[] answer = new int[size];
        int idx = 0;
        for(int i=0; i<arr.length; i++) {
        	int a = arr[i];
        	for(int j=0; j<a; j++) {
        		answer[idx++] = a;
        	}
        }
        answer = Arrays.copyOf(answer, idx);
        return answer;
    }
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(Arrays.toString(s.solution(new int[] {5,1,4})));
		System.out.println(Arrays.toString(s.solution(new int[] {6,6})));
		System.out.println(Arrays.toString(s.solution(new int[] {1})));
	}
}