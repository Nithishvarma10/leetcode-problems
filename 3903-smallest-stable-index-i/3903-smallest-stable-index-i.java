class Solution {
    public int firstStableIndex(int[] nums, int k) {
      
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int index=-1;
        int minins=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
             int min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                min=Math.min(min,nums[j]);
            }
            int ins=max-min;
            if(ins<=k){
                return i;
                
            }
        }
        return index;
    }
}