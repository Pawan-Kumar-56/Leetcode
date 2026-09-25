class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int[] arr=new int[2];
        int k=0;
        arr[0]=-1;
        arr[1]=-1;
        int cnt=0;
        int max=0;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[0]!=-1 && fruits[arr[0]]==fruits[i]){
                arr[0]=i;
                max=Math.max(max,i-j+1);
                continue;
            }
            if(arr[1]!=-1 && fruits[arr[1]]==fruits[i]){
                arr[1]=i;
                max=Math.max(max,i-j+1);
                continue;
            }
            if(cnt==0) arr[0]=i;
            if(cnt==1) arr[1]=i;
            if(cnt==2){
                if (arr[0] < arr[1]) {
                    j = arr[0] + 1;
                    arr[0] = i;
                } else {
                    j = arr[1] + 1;
                    arr[1] = i;
                }
                cnt--;
            }
            cnt++;
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}