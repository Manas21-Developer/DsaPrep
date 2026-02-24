package Array;

public class SumOfSubArrayExceptSelf {
    public static int [] helper (int [] arr , int n ){
        int sum = 0;
        int []  ans = new int [n];
        for (int i : arr) sum += i;
        for (int i =0;i<n;i++){
            ans[i] = sum -arr[i];
        }return ans;
    }

    static void main() {
        int [] arr = {4,3,2,10};
        int [] ans = helper(arr,4);
        for(int i :ans) System.out.print(i+" ");
    }
}
