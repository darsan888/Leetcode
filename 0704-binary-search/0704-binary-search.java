class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int l=nums.length-1;
        for(int i=0;i<nums.length;i++){
            int mid=(s+l)/2;
            if(target ==nums[mid]){
                return mid;
               
            }
            else if(target<nums[mid]){
                l=mid;
            }
            else{
                s=mid+1;
            }
        }
    return -1;
}}