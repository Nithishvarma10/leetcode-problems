class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);

        }
       for(Map.Entry<Integer,Integer> e:map.entrySet()){
        int key=e.getKey();
        int val=e.getValue();
        if(val==2){
            arr.add(key);
        }
       }
       return arr;
    }
}