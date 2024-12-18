import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms:");
        fibbonaci(n);
    }

    public static void fibbonaci(int n){

        int first = 0, second = 1, next;
        if(n>=1) {
            System.out.print(first+" ");
        }
        if(n>=2) {
            System.out.print(second+" ");
        }
        for(int i=3; i<=n; i++){
            next = first + second;
            System.out.print(next+" ");
            first = second;
            second = next;
        }
    }
}
