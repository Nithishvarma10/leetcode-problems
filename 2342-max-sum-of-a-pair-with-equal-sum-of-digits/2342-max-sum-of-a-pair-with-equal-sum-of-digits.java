class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> map=new  HashMap<>();
        int res=-1;
        for(int num:nums){
            int sum=0;
            int temp=num;
            while(temp!=0){
                int dig=temp%10;
                sum+=dig;
                temp/=10;
            }
         if(map.containsKey(sum)){
            res=Math.max(res,map.get(sum)+num);
            map.put(sum,Math.max(map.get(sum),num));

         }
         else{
            map.put(sum,num);
         }
        }
        return res;
        
    }
}