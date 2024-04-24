import java.util.Scanner;
public class ASolution{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        if(n<1 || n>100){
            return;
        }
        int[] arr=new int[n];

        for (int i = 0; i <arr.length; i++) {
            arr[i]=s.nextInt();
            if(arr[i] < Math.pow(-10,9) || arr[i] > Math.pow(10,9))
                return;

        }
        int max=arr[0];
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
    }
}
