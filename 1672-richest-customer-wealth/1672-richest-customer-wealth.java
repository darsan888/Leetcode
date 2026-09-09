class Solution {
    public int maximumWealth(int[][] accounts) {

        int sum1=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
                sum1=Math.max(sum1,sum);
            }

        }
   return sum1;     
    }
}