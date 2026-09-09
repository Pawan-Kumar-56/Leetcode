class Solution {
    public int characterReplacement(String s, int k) {
      int n=s.length();
      int[] hash=new int[26];
      int maxfreq=0;
      int l=0;
      int r=0;
      int ans=0;
      int len=0;
      while(r<n){
        hash[s.charAt(r)-'A']++;
        len=r-l+1;
        maxfreq=Math.max(maxfreq,hash[s.charAt(r)-'A']);
        while(len-maxfreq>k){
            hash[s.charAt(l)-'A']--;     l++;
            len=r-l+1;
       
        }
        ans=Math.max(ans,len);
        r++;
      }  
      return ans;
    }
}