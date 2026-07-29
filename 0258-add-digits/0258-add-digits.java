class Solution {
    public int addDigits(int num) {
        int sum=0;
       while(num>=10){
        int n=num%10;
        int m=num/10;
         sum=n+m;
        num=sum;
            
            
        }
        
    return num;
}}