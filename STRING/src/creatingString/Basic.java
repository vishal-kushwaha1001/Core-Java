package creatingString;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1st way to initialize and declare
        String str1 = "vishal";
        System.out.println("my name is :"+ str1);

        //  input by user
        System.out.println("input string");
        String str2 = sc.nextLine();

        // finding length of str2
        int l = str2.length();
        System.out.println(l);

        // use of charAt
        System.out.println(str2.charAt(5));

    }
}

