import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger f_balls = BigInteger.ONE;
        BigInteger f_share = BigInteger.ONE;
        BigInteger f_bs = BigInteger.ONE;

        for (int i = 1; i <= balls; i++) {
            f_balls = f_balls.multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= share; i++) {
            f_share = f_share.multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= (balls - share); i++) {
            f_bs = f_bs.multiply(BigInteger.valueOf(i));
        }

        BigInteger answer = f_balls.divide(f_share.multiply(f_bs));
        return answer.intValue();
    }
}
