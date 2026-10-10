class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        int size=groupSize;
        if(n%size!=0) return false;
        Arrays.sort(hand);
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);

        }
        int prev=hand[0];
        while (!map.isEmpty()) {
            int first = map.keySet().iterator().next();

            for (int card = first; card < first + groupSize; card++) {
                if (!map.containsKey(card)) {
                    return false;
                }

                int value = map.get(card);

                if (value == 1) {
                    map.remove(card);
                } else {
                    map.put(card, value - 1);
                }
            }
        }
        return true;
    }
}