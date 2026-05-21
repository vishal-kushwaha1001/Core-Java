package calculatePowerCode;

public class BasicPower {
    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent < 0) {
            // Handle negative exponents if needed (e.g., return 1 / calculatePower(base, -exponent))
            throw new IllegalArgumentException("Negative exponents are not supported in this recursive example.");
        } else {
            return base * calculatePower(base, exponent - 1);
        }
    }


}
