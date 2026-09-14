class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int n=groupSizes.length;
        for(int i=0;i<n;i++){
            map.computeIfAbsent(groupSizes[i],k->new ArrayList<>()).add(i);
        }
        List<List<Integer>> res=new ArrayList<>();
       
            for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            Integer key = entry.getKey();
            List<Integer> list = entry.getValue();
            
         
            
             List<Integer> arr=new ArrayList<>();
            for (Integer num : list) {
               
                arr.add(num);
                if(arr.size()==key){
                    res.add(arr);

                    arr=new ArrayList<>();
                }
                
            }
           
        }
        return res;
        

    }
}