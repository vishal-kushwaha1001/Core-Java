
package firstProgram;
import java.util.Scanner;

public class simpleIntrest { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Input principal : ");
    int p = sc.nextInt();

    System.out.print("Input rate : ");
    int r = sc.nextInt();

    System.out.print("Input Time : ");
    int t = sc.nextInt();

    int intrest = (p*r*t)/100;

    System.out.println("Simple Intrest is  : "+ intrest);

}
}
