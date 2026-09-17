import java.util.Stack;
class Solution {
    public int trap(int[] height){

        int n = height.length;
        
        int left = 0;
        int right = n - 1;
        
        int maxLeft = 0;
        int maxRight = 0;
        
        int totalWater = 0;
        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    totalWater += maxLeft - height[left];
                }
                left++; 
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    totalWater += maxRight - height[right];
                }
                right--; 
            }
        }
       
        return totalWater;


    //     int[] ans1 = new int[height.length];
    //     int n = height.length;
    //     Stack<Integer> s = new Stack<>();
        
    //     // initialize ans as -1
    //     for (int i = 0; i < n; i++) ans1[i] = -1;

    //     s.push(height[n - 1]);

    //     // Main backward loop
    //     for (int i = n - 2; i >= 0; i--) {
    //         while (!s.isEmpty() && s.peek() < height[i]) {
    //             s.pop();
    //         }

    //         if (!s.isEmpty()) {
    //             ans1[i] = s.peek();
    //         }

    //         s.push(height[i]);
    //     }
    //     s.clear();
    //     // Stack<Integer> s=new Stack<>();
    //     Stack<Integer> s1=new Stack<>();
    //     // int n=height.length;
    //     for(int i=n-1;i>=0;i--){
    //         s.push(height[i]);
    //     }
    //     int total=0;
    //     int idx=-1;
    //     while(!s.isEmpty()){
    //         int b=s.pop();
    //         idx++;
    //         int cnt=0;
    //         int sub=0;
    //         while(!s.isEmpty()){
    //             if(ans1[idx]==-1) break;
    //             int c=s.peek();
    //             if(c>b){
    //                 break;
    //             }
    //             cnt++;
    //             int r=s.pop();
    //             idx++;
    //             sub=sub-r;
    //         }
    //     int area=b*(cnt);
    //     area=area+sub;
    //     total+=area;
    //     }
    //     return total;
    // }
    // public boolean nextGreater(int[] arr,int x,int idx){
    //     int n=arr.length;
    //     for(int i=idx+1;i<n;i++){
    //         if(arr[i]>=x) return true;
    //     }
    //     return false;
    }
}


    //this will cause TLE //1 hour waste 
    // private int totalarea=0;
    // public int trap(int[] height) {
    //     int n=height.length;
    //     for(int i=0;i<n;i++){
    //         int t=nextGreaterElement(height,i);
    //         i=t;
    //     }
    //     return totalarea;
    // }
    // public int nextGreaterElement(int[] arr,int x){
    //     int n=arr.length;
    //     int idx=-1;
    //     int num=-1;
    //     for(int i=x+1;i<n;i++){
    //         if(arr[i]>=arr[x]){
    //             idx=i;
    //             num=arr[i];
    //             break;
    //         }
    //     }
    //     int area=0;
    //     if(idx!=-1){
    //         area=arr[x]*(idx-x-1);
    //         for(int i=x+1;i<idx;i++){
    //             area=area-arr[i];
    //         }
    //     }
    //     totalarea=totalarea+area;
    //     if(idx!=-1){
    //         return idx-1;
    //     }
    //     else{
    //         return x;
    //     }
    // }
// }