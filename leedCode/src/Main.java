import java.util.*;
class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){

        int n =nums1.length;
        int m = nums2.length;
        int[] mergeArr = new int[n + m ];


        // merging
        int k = 0;
        for(int i = 0 ; i<n ; i++){
            mergeArr[k++] = nums1[i];
        }
        for(int j =0 ; j<m ; j++ ){
            mergeArr[k++] = nums2[j];
        }

        Arrays.sort(mergeArr);


        // median
        int s = mergeArr.length ;
        //  int oddIndex = (len+1 )/2;


        double median;
        if(s % 2 == 0){
            // even
            median = (double) (mergeArr[(s / 2) -1] + mergeArr[(s / 2) ]) /2;

        }
        else {
            // odd
            median = mergeArr[ s/2];

        }

        return median;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};


        System.out.println("median is :" + findMedianSortedArrays(nums1,nums2));


    }
}

