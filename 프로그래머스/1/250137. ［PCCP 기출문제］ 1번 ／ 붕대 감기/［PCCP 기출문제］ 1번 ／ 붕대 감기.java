class Solution {
	public int solution(int[] bandage, int health, int[][] attacks) {
		int idx = 0;
		int time = 0;
		int maxHealth = health;
		for (int i = 1; i <= attacks[attacks.length - 1][0]; i++) {  //1초부터 시작
			if (idx < attacks.length && i == attacks[idx][0]) {
				health -= attacks[idx][1];
				if (health <= 0)
					return -1;
				idx++;
				time = 0;
			} else {
				health += bandage[1];
				if (health > maxHealth)
					health = maxHealth;
				time++;
				if (time >= bandage[0]) {
					health += bandage[2];
					if (health > maxHealth)
						health = maxHealth;
					time = 0;
				}
			}
		}
		return health;
	}
}