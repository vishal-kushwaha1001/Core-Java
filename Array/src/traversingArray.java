import java.util.Scanner;

public class traversingArray {
    public static void linearSearch(int arrayIndex[], int key) {
        for (int i = 0; i < arrayIndex.length; i++) {
            if (arrayIndex[i] == key){
                System.out.println("array found at index : " + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("int size of array : ");
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("which key do you want to find in Array : ");
        int key = sc.nextInt();

        linearSearch(array, key);

        sc.close();
    }

}