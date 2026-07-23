class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int arr[]=new int[k];
        int row=logs.length;
        HashMap<Integer,Set<Integer>>map=new HashMap<>();
        for(int i=0;i<row;i++){
            map.putIfAbsent(logs[i][0],new HashSet<>());
            map.get(logs[i][0]).add(logs[i][1]);
            


        }

        for(Map.Entry<Integer,Set<Integer>> e:map.entrySet()){
            int key=e.getKey();
            int val=e.getValue().size();
            arr[val-1]++;
        }
        return arr;
        
    }
}