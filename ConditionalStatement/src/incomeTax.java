import  java.util.Scanner;
public class incomeTax {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" input annual income : ");
    long annualIncome = sc.nextLong();
    double tax ;
    if( annualIncome <= 700000 ){ tax = 0;

    }
    else  if( annualIncome >= 700000 && annualIncome <= 1200000){
        tax = annualIncome * 0.2;
    }
    else tax = annualIncome * 0.3;
        System.out.println(" your tax is : " + tax);
    }
}
