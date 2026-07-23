class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
       
        int idx=n;

        for(int i=0;i<n;i++){
            int rev=0;
            set.add(nums[i]);
            int temp=nums[i];
           
            while(temp!=0){
                int dig=temp%10;
                rev=rev*10+dig;
                temp/=10;
            }
            set.add(rev);

        }
        return set.size();
    }
}