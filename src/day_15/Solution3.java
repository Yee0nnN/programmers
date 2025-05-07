package day_15;


class Solution3 {
	public int solution(int[] num_list) {
		int count = 0;

		for (int i = 0; i < num_list.length; i++) {
			while (num_list[i] != 1) {
				if (num_list[i] % 2 == 0) {
					num_list[i] /= 2;
					count++;
				} else {
					num_list[i] = (num_list[i] - 1) / 2;
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.solution(new int[] { 12, 4, 15, 1, 14 }));
	}
}
