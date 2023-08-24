import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N:");
        int N = scan.nextInt();
        if (N == 0) {
            System.out.println("END");
        } else {
            int sum = (sumfibo(N - 1));
            int fibonacci;
            for (int i = 0; i < N; i++) {
                fibonacci = (fibo(i));
                System.out.print(fibonacci + " ");
            }
            System.out.println();
            System.out.println("Sum:" + sum);
        }
    }
    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibo(n - 2) + fibo(n - 1);
    }
    public static int sumfibo(int n){
        if(n<=0)
            return 0;
        if(n==1)
            return 1;
        return sumfibo(n-1)+(n-2)+1;
    }
}