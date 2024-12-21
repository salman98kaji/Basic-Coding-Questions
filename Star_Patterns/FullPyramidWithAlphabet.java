package Star_Patterns;

public class FullPyramidWithAlphabet {
    public static void main(String[] args){
        int n=5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            char alphabet = 'A';

            for(int k=1; k<=i; k++){
                System.out.print(alphabet);
                alphabet++;
            }

            alphabet -= 2;
            for(int k=1; k<i; k++){
                System.out.print(alphabet);
                alphabet--;
            }

            System.out.println();
        }
    }
}
