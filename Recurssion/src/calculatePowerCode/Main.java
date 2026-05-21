package calculatePowerCode;

public class Main {
    public static void main(String[] args){
        int base = 2;
        int exponent = 10;
//            int result = BasicPower.calculatePower(base, exponent);
        int result = OptimizePower.calculatePower(base,exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

    }
}
