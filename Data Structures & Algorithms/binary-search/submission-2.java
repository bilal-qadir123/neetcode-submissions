class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while (low <= high) {
            if (nums[low] == target) {
                return low;
            }
            if (nums[high] == target) {
                return high;
            }
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (target > mid) {
                low = mid + 1;
            }
            if (target < mid) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
