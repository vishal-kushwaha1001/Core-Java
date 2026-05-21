package calculatePowerCode;

public class OptimizePower {
    public static int calculatePower(int b , int e){
        if(e==0){
            return 1;
        }
        int halfPower = calculatePower(b,e/2);
        int halfPowerSqr = halfPower * halfPower;

        if(e % 2 !=0){
            return b * halfPowerSqr;
        }
        return halfPowerSqr;
    }
}
