class Solution {
    public int matrixSum(int[][] nums) {
        int m=nums.length;
        int n=nums[0].length;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        
        for(int i=0;i<m;i++){
            Arrays.sort(nums[i]);
            int left=0;
        int right=n-1;
        while(left<right){
            int temp=nums[i][left];
            nums[i][left]=nums[i][right];
            nums[i][right]=temp;
            left++;
            right--;
        }
        }
        int score=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                pq.offer(nums[j][i]);
            }
            score+=pq.poll();
            pq.clear();

        }
        return score;
    }

}