package bootcoding.basic.matths;

public class Reversearray {
    public static void main(String[] args) {
        int arr[] = {10, 15, 20, 24, 30};
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}