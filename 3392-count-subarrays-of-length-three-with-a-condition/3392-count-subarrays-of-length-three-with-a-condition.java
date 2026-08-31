class Solution {
    public int countSubarrays(int[] nums) {
        int i=0;
        int j=2;
        int count=0;
        int n=nums.length;
        while(j<n){
            if(nums[i]+nums[j]==(double)nums[i+1]/2.0){
                count++;
            }
            i++;
            j++;

        }
        return count;
    }
}