class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int num:nums){
            pq.offer(num);
        }
        long score=0;
        while(k-->0){
            long x=pq.poll();
            score+=x;
            pq.offer((int)Math.ceil((double)x/3));

        }
        return score;
    }
}