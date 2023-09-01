package Array4;
import java.util.HashMap;

public class SubarrayWithXorkK {
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int xr = 0, count = 0;
        map.put(xr, map.getOrDefault(xr, 0)+1);
        for(int i = 0; i < a.length; i++){
            xr = xr^a[i];

            int x = xr^b;
            if(map.containsKey(x)){
                count += map.get(x);
            }
            map.put(xr, map.getOrDefault(xr, 0)+1);
        }
        return count;
    }
}
