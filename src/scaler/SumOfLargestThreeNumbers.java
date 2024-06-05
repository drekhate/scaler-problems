package scaler;

public class SumOfLargestThreeNumbers {
    public static void main(String[] args) {
        int[] arr = {1, -7, -3, -4, -5};
        int ans = sumOfLargestThreeNumbers(arr);
        System.out.println(ans);
    }
    public static int sumOfLargestThreeNumbers(int[] arr) {
        int n = arr.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }
        int  ans = first + second + third;
        return ans;
    }
}
