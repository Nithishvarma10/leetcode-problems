class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

    int n=nums.length;
        int max=-1;
        int l=0;
        int r=k-1;
        while(r<n){
            HashSet<Integer> set=new HashSet<>();
            for(int i=l;i<=r;i++){
               set.add(nums[i]);
            }
            for(int num:set){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            l++;
            r++;

        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int key=e.getKey();
            int value=e.getValue();
            if(value==1){
                if(key>max){
                    max=key;
                }
            }
        }
        return max;

       
    }
}