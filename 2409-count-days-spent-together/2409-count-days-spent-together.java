class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        
        // String s1=(arriveAlice.substring(0,2));
        // String s2=(arriveAlice.substring(3,5));
        // StringBuilder sb3=new StringBuilder(arriveBob.substring(0,2));
        // StringBuilder sb4=new StringBuilder(arriveBob.substring(3,5));
        // StringBuilder sb5=new StringBuilder(leaveAlice.substring(0,2));
        // StringBuilder sb6=new StringBuilder(leaveAlice.substring(3,5));
        // StringBuilder sb7=new StringBuilder(leaveBob.substring(0,2));
        // StringBuilder sb8=new StringBuilder(leaveBob.substring(3,5));

        int[] arr=new int[13];
        arr[1]=31;arr[2]=28;arr[3]=31;arr[4]=30;arr[5]=31;arr[6]=30;arr[7]=31;arr[8]=31;arr[9]=30;arr[10]=31;arr[11]=30;arr[12]=31;
        String start;
        if (arriveAlice.compareTo(arriveBob) > 0) {
            start = arriveAlice;
        } else {
            start = arriveBob;
        }

        String end;
        if (leaveAlice.compareTo(leaveBob) < 0) {
            end = leaveAlice;
        } else {
            end = leaveBob;
        }

        // No overlapping dates
        if (start.compareTo(end) > 0) {
            return 0;
        }
        
        int a = Integer.parseInt(start.substring(0, 2));
        int b = Integer.parseInt(start.substring(3,5));
        int c = Integer.parseInt(end.substring(0, 2));
        int d = Integer.parseInt(end.substring(3,5));

        int startDay = b;
        for (int i = 1; i < a; i++) {
            startDay += arr[i];
        }

        int endDay = d;
        for (int i = 1; i < c; i++) {
            endDay += arr[i];
        }

        return endDay - startDay + 1;




        
        
    }
}