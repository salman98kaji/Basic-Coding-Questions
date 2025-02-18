import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String str){
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0; //left pointer of the sliding window

        for(int right=0; right<str.length(); right++){
            while (set.contains(str.charAt(right))) {// If the character already exists in the window
                set.remove(str.charAt(left));// Remove the leftmost character
                left++;
            }
            set.add(str.charAt(right));// Add the new character to the window
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abcadfga";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
