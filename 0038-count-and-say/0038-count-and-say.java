class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        return make(countAndSay(n-1));
    }
    public String make(String s){
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int cnt=1;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                cnt++;
            }
            else{
                sb.append(cnt);
                sb.append(s.charAt(i));
                cnt=1;
            }
        }
        if(cnt>1){
            sb.append(cnt);
            sb.append(s.charAt(n-1));
        }
        if(n>1){
            if(s.charAt(n-1)!=s.charAt(n-2)){
                sb.append(1);
                sb.append(s.charAt(n-1));
            }
        }
        if(n==1) return "11";
        return sb.toString();
    }
}