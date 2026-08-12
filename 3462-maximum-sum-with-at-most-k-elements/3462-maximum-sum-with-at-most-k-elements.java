class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        int n=grid.length;
        int m=grid[0].length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
         PriorityQueue<Integer> p1=new PriorityQueue<>();
        long sum=0;
        long maxsum=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               
                pq.offer(grid[i][j]);
                sum+=grid[i][j];
                while(pq.size()>limits[i]){
                    int r=pq.poll();
                    sum-=r;
                }
               


            }while(!pq.isEmpty()){
                p1.offer(pq.poll());
            }
            
                while(p1.size()>k){
                    int x=p1.poll();
                    sum-=x;
                }
                
            maxsum=Math.max(maxsum,sum);
        }
            return maxsum;
        
            }
}