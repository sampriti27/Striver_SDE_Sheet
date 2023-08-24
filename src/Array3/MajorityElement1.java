package Array3;

public class MajorityElement1 {

        public static int majorityElement(int []v) {
            // Write your code here
            int n = v.length;
            int count = 0;
            int maxElement = 0;
            for(int i = 0; i < n; i++){
                if(count == 0){
                    maxElement = v[i];
                    count += 1;
                }
                else if(maxElement != v[i]) count--;
                else count++;
            }
            return maxElement;
        }
}
