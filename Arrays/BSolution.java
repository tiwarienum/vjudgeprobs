import java.util.Scanner;
public class BSolution {
    public static void Reverse(long[] arr, int n) {
        if (n == 0) {
            return;
        }
        System.out.print(arr[n - 1]+" ");
        Reverse(arr, n - 1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n < 1 || n > 100) {
            return;
        }
        long[] arr = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextLong();
            if (arr[i] < 0 || arr[i] > Math.pow(10, 18))
                return;
        }
       BSolution.Reverse(arr,n);
    }
}
