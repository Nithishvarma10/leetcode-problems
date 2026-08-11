class Solution {
    class Pair{
        int row;
        int col;
        int tm;
        Pair(int row,int col,int tm){
            this.row=row;
            this.col=col;
            this.tm=tm;
        }
    }
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> pq=new LinkedList<>();
        int cntfresh=0;
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    pq.offer(new Pair(i,j,0));
                    vis[i][j]=2;
                }
                else {
                    vis[i][j]=0;
                }
                if(grid[i][j]==1){
                    cntfresh++;
                }
            }
        }
        int tm=0;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        int cnt=0;
        while(!pq.isEmpty()){
            int r=pq.peek().row;
            int c=pq.peek().col;
            int t=pq.peek().tm;
            tm=Math.max(tm,t);
            pq.remove();
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    pq.offer( new Pair(nrow,ncol,t+1));
                    vis[nrow][ncol]=2;
                    cnt++;


                }
                
            }

        }
        if(cnt!=cntfresh){
                    return -1;
                }
                return tm;


    }
}