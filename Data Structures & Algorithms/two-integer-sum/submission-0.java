class Solution {
    public int[] twoSum(int[] nums, int target) {
        int idx1 = 0;
        int idx2 = 0;

        for (int i = 0; i < nums.length - 1; i++) { 
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];

                if (sum == target) {
                    idx1 = i;
                    idx2 = j;
                    break;
                }
            }
        }
        return new int[] {idx1, idx2};
    }
}
