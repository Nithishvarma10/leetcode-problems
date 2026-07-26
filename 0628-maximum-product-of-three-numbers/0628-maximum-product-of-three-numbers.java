class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
       int maxp=Integer.MIN_VALUE;
       int n=nums.length;
       int negmax=nums[0]*nums[1]*nums[n-1];
       int posmax=nums[n-3]*nums[n-2]*nums[n-1];
       maxp=Math.max(negmax,posmax);
       return maxp;
       

        
    }
}