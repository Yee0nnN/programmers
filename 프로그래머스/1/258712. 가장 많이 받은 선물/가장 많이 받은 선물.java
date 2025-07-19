class Solution {
	public int solution(String[] friends, String[] gifts) {
		int answer = 0;
		int[] give = new int[friends.length];
		int[] get = new int[friends.length];

		int[][] giveList = new int[friends.length][friends.length];

		for (String g : gifts) {
			String[] giftFriends = g.split(" ");
			int giver = 0;
			int getter = 0;

			for (int i = 0; i < friends.length; i++) {
				if (friends[i].equals(giftFriends[0]))
					giver = i;
				if (friends[i].equals(giftFriends[1]))
					getter = i;
			}

			giveList[giver][getter]++;
			give[giver]++;
			get[getter]++;
		}
		
		// 선물 지수 = 준 선물 - 받은 선물
        int[] count = new int[friends.length];
        for (int i = 0; i < friends.length; i++) {
        	count[i] = give[i] - get[i];
        }
        
		// 다음 달
		int[] next = new int[friends.length];

		for (int i = 0; i < friends.length; i++) {
			for (int j = i + 1; j < friends.length; j++) { 
				if (giveList[i][j] > giveList[j][i]) {
					next[i]++;
				} else if (giveList[i][j] < giveList[j][i]) {
					next[j]++;
				} else {
					if (count[i] > count[j]) {
						next[i]++;
					} else if (count[i] < count[j]) {
						next[j]++;
					}
				}
			}
		}

		int max = 0;
		for (int k : next) {
			max = Math.max(max, k);
		}
		answer = max;
		return answer;
	}
}
