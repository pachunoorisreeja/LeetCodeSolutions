package Hard;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3},new int[]{4,5}));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length+nums2.length];
        int count =0;
        double medium =0.0;
        for(int a:nums1){
            arr[count] =a;
            count++;

        }
        for(int aa:nums2){
            arr[count] =aa;
            count++;

        }
        Arrays.sort(arr);
        if(arr.length%2==0){
            medium = (double)(arr[(arr.length)/2] + arr[(arr.length-1)/2] )/2;

        }
        else{
            medium = (double)arr[arr.length/2];
        }
        return medium;}
}
