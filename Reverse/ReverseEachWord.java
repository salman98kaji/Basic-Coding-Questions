package Reverse;

public class ReverseEachWord {
    public static void main(String[] args){
        String str = "Hello world salman";
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        for(String word: words){
            StringBuilder sb = new StringBuilder(word);
            reversed.append(sb.reverse().toString()).append(" ");
        }
        System.out.println("Reversed Each Word: " + reversed.toString().trim());
    }
}
