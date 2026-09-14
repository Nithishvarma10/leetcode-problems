class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c: chars.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int sum=0;

        for(String s : words){
            HashMap<Character,Integer> map1=new HashMap<>();
            for(char c: s.toCharArray()){
                map1.put(c,map1.getOrDefault(c,0)+1);
            }
            boolean flag=true;
             for(char c: map1.keySet()){
                if(!map.containsKey(c) ||  map.get(c)<map1.get(c)){
                    flag=false;
                break;

                    
                }
            }
            if(flag){
                sum+=s.length();
            }
            
        }
        return sum;
    }
}