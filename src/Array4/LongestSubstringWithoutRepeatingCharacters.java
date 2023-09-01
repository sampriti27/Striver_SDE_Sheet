package Array4;
import java.util.HashSet;
public class LongestSubstringWithoutRepeatingCharacters {
    public static int uniqueSubstrings(String input)
    {
        //write your code here
        int i = 0, j= 0;
        HashSet<Character> set = new HashSet<>();
        int ans = Integer.MIN_VALUE;
        while(j < input.length()){
            char ch = input.charAt(j);
            while(i < input.length() && set.contains(ch)){
                set.remove(input.charAt(i));
                i++;
            }
            set.add(ch);
            ans = Math.max(ans, set.size());
            j++;
        }
        return ans;
    }
}
