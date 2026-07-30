class Solution {
    public int[] searchRange(int[] nums, int target) {
      int[] ans={-1,-1};
      ans[0]=firstoccurence(nums,target);
      ans[1]=secondoccurence(nums,target);
      return ans;
    }
    private int firstoccurence(int[] nums,int target){
        int index=-1;
        int low=0;
        int high=nums.length;
        while(low<high){

            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                index=mid;
                high=mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return index;
    }
    private int secondoccurence(int[] nums,int target){
        int index=-1;
        int low=0;
        int high=nums.length;
        while(low<high){

            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                index=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return index;
    }
}