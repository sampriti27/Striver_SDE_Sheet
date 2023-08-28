package Array3;
import java.util.ArrayList;
public class ReversePair {
    private int merge(int[] nums, int l, int mid, int h){
        int cnt = 0;
        int j = mid+1;
        for(int i = l; i <= mid; i++){
            while(j <= h && nums[i] > (2 * (long)nums[j])){
                j++;
            }
            cnt += (j-(mid+1));
        }

        ArrayList<Integer> temp = new ArrayList<>();
        int left = l, right = mid+1;
        while(left <= mid && right <= h){
            if(nums[left] <= nums[right]){
                temp.add(nums[left++]);
            }
            else{
                temp.add(nums[right++]);
            }
        }
        while(left <= mid){
            temp.add(nums[left++]);
        }
        while(right <= h){
            temp.add(nums[right++]);
        }
        //copy back the temp array into original array
        for(int i = l; i <= h; i++){
            nums[i] = temp.get(i-l);
        }
        return cnt;
    }

    private int mergeSort(int[] nums, int l, int h){
        if(l >= h) return 0; // if only a single element is present it will never contribute to answer
        int mid = (l+h)/2;
        int inv = mergeSort(nums, l, mid);
        inv += mergeSort(nums,mid+1, h);
        inv += merge(nums, l, mid, h);
        return inv;
    }

    public int reversePairs(int[] nums){
        return mergeSort(nums, 0, nums.length -1);
    }
}
