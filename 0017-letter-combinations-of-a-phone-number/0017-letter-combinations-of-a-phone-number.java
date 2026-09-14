class Solution {
    List<String> list=new ArrayList<>();
    StringBuilder sb=new StringBuilder();
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(2,"abc");map.put(3,"def");map.put(4,"ghi");map.put(5,"jkl");
        map.put(6,"mno");map.put(7,"pqrs");map.put(8,"tuv");map.put(9,"wxyz");

        int n=digits.length();
        String[] arr=new String[digits.length()];
        for(int i=0;i<n;i++){
            arr[i]=map.get(digits.charAt(i)-'0');
        }
        f(0,arr,n);
        return list;

    }
    public void f(int idx,String[] arr,int n){
        if(idx==n){
            list.add(sb.toString());
            return;
        }
        String s=arr[idx];
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            f(idx+1,arr,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}