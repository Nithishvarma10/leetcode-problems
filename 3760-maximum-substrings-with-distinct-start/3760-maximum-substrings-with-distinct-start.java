class Solution {
    public int maxDistinct(String s) {
       int count=0;
       HashMap<Character,Integer> map=new HashMap<>();
       for(char c:s.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
        if(map.get(c)==1){
            count++;
        }

       } 
       return count;
    }
}