package Array3;
import java.util.ArrayList;
public class SearchIn2DMatrix {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int n = mat.size();
        if(n == 0) return false;
        int m = mat.get(0).size();

        int lo = 0, hi = n*m - 1;

        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(mat.get(mid/m).get(mid%m) == target) return true;
            else if(mat.get(mid/m).get(mid%m) < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return false;
    }
}
