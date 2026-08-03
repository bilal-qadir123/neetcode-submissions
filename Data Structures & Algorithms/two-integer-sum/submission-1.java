class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int idx1 = 0;
        int idx2 = 0;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            
            int number = target - nums[i];
            if (map.containsKey(number)) {
                idx1 = map.get(number);
                idx2 = i;
            }
            else {
                map.put(nums[i], i);
            }
        }
        return new int[] {idx1, idx2};
    }
}
