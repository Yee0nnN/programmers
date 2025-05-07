package day_22;

import java.math.BigInteger;

class Solution2 {
    public String solution(String a, String b) {
    	BigInteger num1 = new BigInteger(a);
    	BigInteger num2 = new BigInteger(b);
    	return (num1.add(num2)).toString();
    }
    public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.solution("582","734"));
		System.out.println(s.solution("18446744073709551615","287346502836570928366"));
		System.out.println(s.solution("0","0"));
	}
}