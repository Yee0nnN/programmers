package day_16;


class Solution4 {
    public String solution(String myString) {
    	return myString.toLowerCase().replace('a', 'A');
    }
    
	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(s.solution("abstract algebra"));
	}
}
