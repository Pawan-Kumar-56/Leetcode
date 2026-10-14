class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum>9*num){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        while(sum!=0){
            if(sum>9){
                sb.append(9);
                sum=sum-9;
            }else{
                sb.append(sum);
                sum=0;
            }
        }
        int len=sb.length();
        if(len<num){
            int a=num-len;
            while(a!=0){
                sb.append(0);
                a--;
            }
        }
        return sb.toString();

    }
}