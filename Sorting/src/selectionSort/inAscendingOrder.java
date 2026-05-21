package selectionSort;

import java.util.Scanner;

public class inAscendingOrder {

    public static void printArr(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public  static  void sortArr(int[] arr){
        int n= arr.length;
        for(int i =0 ; i<n-1 ; i++){
            // i represent min index
        int min_index = i;
           // finding minimum index in unsorted  part of Array
        for(int j = i+1 ; j< n ; j++){
               if(arr[j] < arr[min_index]){
                   min_index = j;
               }
           }
           // sweeping
           int temp = arr[i];
            arr[i]= arr[min_index];
            arr[min_index] = temp;


        }
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
