package Excercise;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,4,0,1};
         getReverseArray(arr);
    }
    public static void getReverseArray(int[] arr){
        String s = Arrays.toString(arr);
        for (int i = arr.length-1; i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
