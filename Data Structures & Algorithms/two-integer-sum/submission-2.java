class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int idx1 = 0;
        int idx2 = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if (map.containsKey(difference)) {
                idx1 = i;
                idx2 = map.get(difference);
                if (idx1 > idx2) {
                    int temp = idx2;
                    idx2 = idx1;
                    idx1 = temp;
                }
                return new int[] {idx1, idx2};
            }

            map.put(nums[i], i);

        }
        return new int[] {idx1, idx2};
    }
}