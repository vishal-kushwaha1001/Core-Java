package bubbleSort;

import java.util.Scanner;

public class optimizeMethod {
    public static void printArr(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public  static  void sortArr(int[] arr){
        boolean flag = false;
        int iteration =0;
        int n= arr.length;
        for(int i =0 ; i<n-1 ; i++){
            iteration++;
            for(int j = 0 ; j<n-1-i ; j++ ){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
        System.out.println(iteration);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input size of Array :");
        int size = sc.nextInt();
        System.out.print("Input Array : ");
        int[] arr = new int[size];
        for(int i = 0 ; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("original Array : ");
        printArr(arr);
        System.out.println("Shorted Array :");
        sortArr(arr);
        printArr(arr);
    }

}
