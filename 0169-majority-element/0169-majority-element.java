class Solution {
    public int majorityElement(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int sum = 1;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    sum++;
                }
            }

            if (sum > nums.length / 2) {
                return nums[i];
            }
        }

        return -1;
    }
}