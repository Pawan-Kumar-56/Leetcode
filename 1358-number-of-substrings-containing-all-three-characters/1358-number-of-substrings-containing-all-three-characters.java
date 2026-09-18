class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int a1=0;
        int b1=0;
        int c1=0;
        int check=0;
        int ans=0;
        int j=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='a') a1++;
            else if(ch=='b') b1++;
            else if(ch=='c') c1++;
            while(c1>0 && a1>0 && b1>0){
                ans+=n-i;
                if(s.charAt(j)=='a') a1--;
                else if(s.charAt(j)=='b') b1--;
                else c1--;
                check=1;
                j++;
            }
        }
        if(check==0) return 0;
        return ans;
    }
}