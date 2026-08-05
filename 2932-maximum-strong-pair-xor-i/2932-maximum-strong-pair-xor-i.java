class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
           
            for(int j=i;j<n;j++){
              
            int min=Math.min(nums[i],nums[j]);
                
                if(Math.abs(nums[i]-nums[j])<=min){
                    int xor=nums[i] ^ nums[j];
                    max=Math.max(max,xor);
                }
            }
        }
        return max;
    }
}