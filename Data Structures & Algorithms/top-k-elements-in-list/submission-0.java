class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[i] == nums[j] && i != j) {
                    count++;
                }
            }
            map.put(nums[i], count);
        }

        Integer[] keys = new Integer[map.size()];
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            keys[index++] = entry.getKey();
        }

        Arrays.sort(keys, (a, b) -> map.get(b) - map.get(a));

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = keys[i];
        }

        return result;
    }
}