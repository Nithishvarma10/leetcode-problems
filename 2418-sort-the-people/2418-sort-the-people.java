class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<heights.length;i++){
            pq.offer(new int[]{heights[i],i});
        }
        String s[]=new String[heights.length];
        int k=0;
        while(!pq.isEmpty()){
            int[] x=pq.poll();
            int index=x[1];
            s[k++]=names[index];
        }
        return s;
    }
}