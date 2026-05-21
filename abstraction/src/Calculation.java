
abstract  class Calculator {
//    int result;
    abstract int  add(int x, int y);
    abstract  int subtract(int x , int y);
    abstract int mul(int x, int y);
    abstract int divide(int x,int y);
}
 class  Operation extends Calculator{
    int add(int x, int y){
        return x + y;
    }
    int subtract(int x , int y){
        return  x- y;
    }

     int mul(int x, int y){
        return  x*y;
    }
    int divide(int x, int y){
        return x/y;
    }
}

public class Calculation{
    public static void main(String[] args) {
        Operation op1 = new Operation();
      int  result = op1.add(4, op1.subtract(56,op1.mul(3,op1.divide(45,9) )));
        System.out.println(result);
    }
}
