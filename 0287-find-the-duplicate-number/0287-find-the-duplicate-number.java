class Solution {
    public int findDuplicate(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i]);
            if(nums[index]<0){
                 ans=Math.abs(nums[i]);
            }
            nums[index]=-nums[index];

        }
        return ans;
    }
}