import java.util.Scanner;

public class ReverseHalfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String originalStr = sc.nextLine();

        int mid = originalStr.length()/2;
        String firstHalf = originalStr.substring(0, mid);
        String reversedHalf ="";

        for(int i=firstHalf.length()-1; i >= 0; i--){
            reversedHalf = reversedHalf + firstHalf.charAt(i);
        }
        String result = reversedHalf + originalStr.substring(mid);

        System.out.println("Reversed string :"+result);
    }

}
