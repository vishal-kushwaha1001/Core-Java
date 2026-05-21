package creatingString;
import java.util.*;



public class InBuildFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input string :");
        String s1 = sc.nextLine();

        // indexOf()
        System.out.println(s1.indexOf('a'));

        // compareTo()
        String s2 = "hello";
        String s3 = "zello";
        System.out.println(s2.compareTo(s3));

        // conatain()
        System.out.println(s1.contains("ello"));

        // startsWith()
        System.out.println(s1.startsWith("h"));

        // toUpperCase() and toLowerCase()
        System.out.println(s1.toUpperCase());
    }
}
