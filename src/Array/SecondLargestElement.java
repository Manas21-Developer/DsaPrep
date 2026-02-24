package Array;

public class SecondLargestElement {
    public static int  helper (int [] arr)
    {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i :arr){
            if(i >max1) max1 = i;
        }
        for (int i :arr){
            if(i>max2 && i!= max1) max2 = i;
        }
        if(max2 == Integer.MIN_VALUE) return -1;
        else return max2;
    }

    public static void main() {
        int [] arr = {12,4,67,98};
        int ans = helper(arr);
        System.out.print(ans);
    }
}
