class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
       Stack<Integer> st=new Stack<>();
       boolean flag=false;
        for(int i=0;i<n;i++){
            flag=false;
            while(!st.isEmpty() && ((st.peek()>0 && asteroids[i]<0))){
                
                int a=asteroids[i];
                int b=st.pop();
                if(Math.abs(a)>Math.abs(b)){
                    flag=false;
                    continue;
                }
                else if(Math.abs(a)<Math.abs(b)){
                    st.push(b);
                    flag=true;
                    break;
                }
                else{
                    flag=true;
                    break;
                }
            }
            if(!flag){
                st.push(asteroids[i]);
            }

        }
        
        int[] arr=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            arr[i]=st.pop();
        }

        return arr;

    }
}