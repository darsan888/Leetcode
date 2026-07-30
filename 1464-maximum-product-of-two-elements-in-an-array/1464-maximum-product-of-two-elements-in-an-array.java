class Solution {
    public int maxProduct(int[] nums) {
        int n=Integer.MIN_VALUE;
        int m=Integer.MIN_VALUE;
        for(int i:nums){
            if(n<i){
                m=n;
                n=i;
            }
            else if(m<i){
                m=i;
            }
        }
        
    return (n-1)*(m-1);
}}