class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        List<Integer> arr1=new ArrayList<>();
         List<Integer> arr2=new ArrayList<>();
         arr1.add(nums[0]);
         arr2.add(nums[1]);
        for(int i=2;i<=n-1;i++){
           
                if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
                    arr1.add(nums[i]);
                }
                else{
                    arr2.add(nums[i]);
                }
            
           


        }
        int res[]=new int[n];
        for(int i=0;i<arr1.size();i++){
            res[i]=arr1.get(i);
        }
        int indx=0;
        for(int i=arr1.size();i<n;i++){
            res[i]=arr2.get(indx++);
        }
        return res;

    }
}