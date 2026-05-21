import java.util.Scanner;
public class peopleAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" input Age : ");
        int age = sc.nextInt();

        if( age> 0 && age <= 18 ){
            System.out.println( "adult ");
        }
        else  if( age> 18 && age <= 32 ){
            System.out.println( "teenager or younger,  ");
        }
        else if( age> 32&& age <= 50 ){
            System.out.println( "  married  ");
        }
        else {
            System.out.println( " old man ");
        }
    }
    
}
