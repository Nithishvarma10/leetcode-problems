class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int res=0;
        for(int num:nums){
            set.add(num);
        }
        int n=nums.length;
            int sum=nums[0];
      if(n==1){
        sum=nums[0]+1;
      }
   int i=1;
       while(i<n){
            if(nums[i]!=nums[i-1]+1){
                
                break;
            }else{
            sum+=nums[i];
            }

            i++;
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;
      
       
    }
}