package creatingClassesAndObjects;

import java.util.Scanner;

public class Add {
    // creating instance variable x and y
    int x ,y;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("input first value :");
        x = sc.nextInt();
        System.out.print("input second value : ");
        y = sc.nextInt();

    }

    void putData(){
        System.out.println(" Addition is :  "+ (x +y));
    }

    public static void main(String[] args) {
        Add aa = new Add();
        aa.getData();
        aa.putData();
    }
}

