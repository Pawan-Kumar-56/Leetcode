class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        StringBuilder sb=new StringBuilder();
        if(n<1) return "";
        else if(n==1) return strs[0];
            StringBuilder sbb1=new StringBuilder();
            String st1=strs[0];
            String st2=strs[0+1];
            int q1=st1.length();
            int q2=st2.length();
            int min2=Math.min(q1,q2);
            for(int j=0;j<min2;j++){
                if(st1.charAt(j)==st2.charAt(j)){
                    sbb1.append(st1.charAt(j));
                }
                else break;
            }
            sb.append(sbb1);
        for(int i=1;i<n-1;i++){
            StringBuilder sb1=new StringBuilder();
            String s1=strs[i];
            String s2=strs[i+1];
            int n1=s1.length();
            int n2=s2.length();
            int min=Math.min(n1,n2);
            for(int j=0;j<min;j++){
                if(s1.charAt(j)==s2.charAt(j)){
                    sb1.append(s1.charAt(j));
                }
                else break;
            }
            String a=sb.toString();
            String b=sb1.toString();
            sb1.setLength(0);
            sb.setLength(0);
            int len1=a.length();
            int len2=b.length();
            int min1=Math.min(len1,len2);
            for(int j=0;j<min1;j++){
                if(a.charAt(j)==b.charAt(j)){
                    sb1.append(a.charAt(j));
                }
                else break;
            }
            sb.append(sb1);
        }
        return sb.toString();
    }
}