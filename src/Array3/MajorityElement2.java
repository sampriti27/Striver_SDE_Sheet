package Array3;
import java.util.*;
public class MajorityElement2 {
    public static List< Integer > majorityElement(int []v) {
        // Write your code here
        int n = v.length, num1 = Integer.MAX_VALUE, num2 = Integer.MAX_VALUE, c1 = 0, c2 = 0;
        List<Integer> ans = new ArrayList<>();
        for(int e : v){
            if(num1 == e){
                c1++;
            }
            else if(num2 == e){
                c2++;
            }
            else if(c1 == 0){
                num1 = e;
                c1++;
            }
            else if(c2 == 0){
                num2 = e;
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }

        c1 = 0; c2 = 0;
        for(int e : v){
            if(e == num1) c1++;
            if(e == num2) c2++;
        }

        if(c1 > n/3) ans.add(num1);
        if(c2 > n/3) ans.add(num2);

        return ans;
    }
}
