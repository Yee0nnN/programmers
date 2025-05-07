package day_16;

class Solution5 {
    public String solution(String my_string, String alp) {
    	return my_string.replace(alp, alp.toUpperCase());
    }
    
	public static void main(String[] args) {
		Solution5 s = new Solution5();
		System.out.println(s.solution("programmers","p"));
	}
}