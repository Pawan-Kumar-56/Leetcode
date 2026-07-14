class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(') st.push(ch);
            else if(ch=='[') st.push(ch);
            else if(ch=='{') st.push(ch);

            else if(ch==')'){
                if(st.isEmpty() || st.peek()!='(') return false;
                else st.pop();
            }
            else if(ch==']'){
                if(st.isEmpty() || st.peek()!='[') return false;
                else st.pop();
            }
            else if(ch=='}'){
                if(st.isEmpty() || st.peek()!='{') return false;
                else st.pop();
            }

        }
        return st.isEmpty();
    }
}