class Solution {
    public int minimumDeletions(int[] nums) {
        int minindex=0;
        int maxindex=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]<nums[minindex]){
                minindex=i;
            }
            if(nums[i]>nums[maxindex]){
                maxindex=i;
            }
        }
        if(minindex>maxindex){
            int temp=minindex;
            minindex=maxindex;
            maxindex=temp;
        }
        int front=maxindex+1;
        int back=n-minindex;
        int both=(minindex+1)+(n-maxindex);
        int min=Math.min(Math.min(front,back),both);
        return min;
        
    }
}