class Solution {
    public int search(int[] nums, int target) {
        int f = 0;
        int l = nums.length - 1;

        while (f <= l) {
            int mid = (f + l) / 2;

            if (target == nums[mid]) {
                return mid;
            }
            else if (target < nums[mid]) {
                l = mid - 1;
            }
            else {
                f = mid + 1;
            }
        }

        return -1;
    }
}