package Array4;
import java.util.*;
public class LongestConcecutiveSubsequence {
    public static int lengthOfLongestConsecutiveSequence(int[] nums, int N) {
        // Write your code here.
        Set <Integer> set = new HashSet<>();

        for(int e : nums)
            set.add(e);

        int cnt = 0;
        for(int e : nums){
            if(!set.contains(e - 1))
            {
                int curElem = e;
                int curr = 1;
                while(set.contains(curElem + 1)){
                    curElem += 1;
                    curr +=1;
                }
                cnt = Math.max(cnt,curr);
            }


        }

        return cnt;
    }
}
