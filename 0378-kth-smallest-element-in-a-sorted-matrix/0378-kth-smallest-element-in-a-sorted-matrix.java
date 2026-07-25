class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m=matrix.length;
        int n=matrix[0].length;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->a-b);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                pq.offer(matrix[i][j]);
            }
        }
        int x=0;
        while(k-->0){
            x=pq.poll();

        }
        return x;
    }
}