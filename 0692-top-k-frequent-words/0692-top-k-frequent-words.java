class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        ArrayList<String> arr=new ArrayList<>();
        PriorityQueue<Map.Entry<String,Integer>> pq=new PriorityQueue<>((a,b)->{
            if(b.getValue()==a.getValue())
            return a.getKey().compareTo(b.getKey());
            return b.getValue()-a.getValue();
        });
        pq.addAll(map.entrySet());
        while(k-->0){
            Map.Entry<String,Integer> e=pq.poll();

            arr.add(e.getKey());
            
        }
        
        return arr;

    }
}