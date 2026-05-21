import  java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.print(" Input gender : ");
        char gender = sc.next() .charAt(0);


        if( gender == 'm' || gender == 'M' || gender == 'f' || gender == 'F'){
            double bonus;
            System.out.print("input bank balance : ");
            double bankBalance = sc.nextDouble();

            if(gender == 'F' || gender == 'f'){


                if( bankBalance <= 5000){ bonus = bankBalance * 0.02; }
                else bonus = bankBalance *0.05;


            }
            else { bonus = bankBalance * 0.02;

            }
            System.out.println("bonus is : " + bonus);




        }
        else System.out.println("invalid input  please type  m or f ");

    }

}

