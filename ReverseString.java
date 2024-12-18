import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String originalString = sc.nextLine();

        int n = originalString.length();

        String reversedString = "";

        for(int i=n-1; i>=0; i--){
            reversedString = reversedString + originalString.charAt(i);
        }

        System.out.print("Reversed string: "+reversedString);
    }

}
