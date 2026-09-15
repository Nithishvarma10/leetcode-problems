class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> res=new ArrayList<>();
        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String key= new String(arr);
            map.computeIfAbsent(key,k->new ArrayList<>()).add(s);

        }
        for(Map.Entry<String,List<String>> e:map.entrySet()){
            String key=e.getKey();
            List<String> ls=e.getValue();
            List<String> bs=new ArrayList<>();
            for(int i=0;i<ls.size();i++){
                bs.add(ls.get(i));

            }
            res.add(bs);
        }
        return res;
    }
}