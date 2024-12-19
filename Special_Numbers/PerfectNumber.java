package Special_Numbers;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPerfect(number)) {
            System.out.println(number + " is a Perfect number.");
        } else {
            System.out.println(number + " is not a Perfect number.");
        }
    }

    public static boolean isPerfect(int num){
        int sum =0;
        for(int i=1; i<num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum == num;
    }
}
