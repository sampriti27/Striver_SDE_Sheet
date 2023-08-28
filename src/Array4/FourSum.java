package Array4;
import java.util.*;
public class FourSum {
    public static List<List<Integer>> fourSum(int []arr, int k) {
        // Write your code here.
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < n -3;i++){
            if(i > 0 && arr[i] == arr[i-1]) {continue;}
            for(int j = i+1;j < n-2;j++){
                if(j > i+1 && arr[j] == arr[j-1]) {continue;} // to skip the identical elements
                int lo = j+1,hi=n-1,sum = k - (arr[i] + arr[j]);
                while(lo < hi){
                    if(arr[lo] + arr[hi] == sum){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[lo]);
                        temp.add(arr[hi]);

                        ans.add(temp);

                        while(lo < hi && arr[lo] == arr[lo+1]) lo++;
                        while(lo < hi && arr[hi] == arr[hi-1]) hi--;

                        lo++;
                        hi--;

                    }
                    else if(arr[lo] + arr[hi] < sum) lo++;

                    else hi--;
                }
            }
        }
        return ans;
    }
}
