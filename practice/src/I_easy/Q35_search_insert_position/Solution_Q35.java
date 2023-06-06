package I_easy.Q35_search_insert_position;

public class Solution_Q35 {
    public int searchInsert(int[] nums, int target) {
        int idx = 0;
        while(idx < nums.length) {
            if(nums[idx] == target) return idx;
            else if(nums[idx] < target) idx++;
            else break;
        }
        return idx;
    }
}
