class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(i>=k){
                sum=sum-nums[i-k];
            }
            sum+=nums[i];
            if(i>=k-1){
                max=Math.max(max,sum);
            }


        }
        return (double)max/k;
    }
}