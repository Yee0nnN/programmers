package day_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//04.콜라츠 수열 만들기
class Solution4 {
	public int[] solution(int n) {
		List<Integer> answer = new ArrayList<>();

		while (n != 1) {
			if (n % 2 == 0) {
              answer.add(n);
				n = n / 2;
			} else {
              answer.add(n);
				n = 3 * n + 1;
			}
		}
      
      answer.add(n);
      
      int[] result = new int[answer.size()];
      for(int i=0; i<answer.size();i++) {
      	result[i] = answer.get(i);
      }
      

		return result;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		int[] result = s.solution(10);
		System.out.println(Arrays.toString(result));
	}
}