class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int num=101;
       
        for(int i=1;i<=100;i++){
            if(!set.contains(k*i)){
                num=k*i;
                break;

            }
            
        }
        return num;
        
    }
}