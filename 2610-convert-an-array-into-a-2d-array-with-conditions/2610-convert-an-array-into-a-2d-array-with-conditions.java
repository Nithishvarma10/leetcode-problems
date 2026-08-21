class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<List<Integer>> res=new ArrayList<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        while(!map.isEmpty()){
            List<Integer> arr=new ArrayList<>();
             List<Integer> remove = new ArrayList<>();
            for(Map.Entry<Integer,Integer> e:map.entrySet()){
                int key=e.getKey();
                int val=e.getValue();
                arr.add(key);
                if(val==1){
                    remove.add(key);
                }
                else{
                    map.put(key,val-1);
                }


            }
            for(int k:remove){
                map.remove(k);
            }
            res.add(arr);

        }
        return res;
    }
}