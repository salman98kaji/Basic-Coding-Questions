package Star_Patterns;

public class PascalsTriangle {
    public static void main(String[] args){
        int n=5;
        for(int i=0; i<n; i++){
            // Print leading spaces for formatting
            for(int j=0; j<=n-i-1; j++){
                System.out.print(" ");
            }

            int value =1;
            for(int k=0; k<=i; k++){
                System.out.print(value+" ");
                value = value * (i-k)/(k+1);
            }
            System.out.println();
        }
    }
}

//Pascal's Rule: Each number in Pascal's Triangle is the sum of the two numbers directly above it.
