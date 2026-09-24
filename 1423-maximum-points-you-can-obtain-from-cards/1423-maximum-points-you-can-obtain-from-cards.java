class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int max=0;
        int sum=0;
        int size=n-k;
        int idx=0;
        int total=0;
        for(int i=0;i<n;i++){
            total+=cardPoints[i];
        }
        for(int i=0;i<size;i++){
            sum+=cardPoints[i];
            idx=i;
        }
        int j=0;
        int min=sum;
        for(int i=size;i<n;i++){
            sum=sum+cardPoints[i];
            sum=sum-cardPoints[j];
            j++;
            min=Math.min(sum,min);
        }
        return total-min;
    }
}