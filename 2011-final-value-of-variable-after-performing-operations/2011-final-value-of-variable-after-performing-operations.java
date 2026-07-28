class Solution {
    public int finalValueAfterOperations(String[] operations) {
       
        int b=0;
        for(int i=0;i<=operations.length-1;i++){
                if(operations[i].contains("++")){
                    b++;
                }else{ 
                b--;
            
                }
            }
        
        return b;
    }}
