class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, (a, b) -> {
            if (a[2] != b[2]) return Integer.compare(a[2], b[2]);
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });
        Queue<int[]> q=new LinkedList<>();
        int n=trips.length;
        for(int i=0;i<n;i++){
            int pass=trips[i][0];
            int a=trips[i][2];
            q.add(new int[]{pass,a});
        }
        Arrays.sort(trips, (a, b) -> {
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
            if (a[2] != b[2]) return Integer.compare(a[2], b[2]);
            return Integer.compare(a[0], b[0]);
        });
        
        int carry=0;
        for(int i=0;i<n;i++){
            int pass=trips[i][0];
            int a=trips[i][1];
            carry+=pass;
            while(q.peek()[1]<=a){
                int[] arr=q.poll();
                int w=arr[0];
                int s=arr[1];
                carry-=w;
            }
            if(carry>capacity){
                return false;
            }
            
        }
        return true;
    }
}