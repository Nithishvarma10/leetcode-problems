class Solution {
    public int[] findDegrees(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int arr[]=new int[row];
        for(int i=0;i<row;i++){
            int count=0;
            for(int j=0;j<col;j++){
                if(matrix[i][j]==1){
                    count++;
                }

            }
            arr[i]=count;
        }
        return arr;
    }
}