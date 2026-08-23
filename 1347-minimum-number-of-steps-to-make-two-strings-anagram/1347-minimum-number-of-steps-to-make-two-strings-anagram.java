class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        
         for(char c:s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
         }
         int steps=0;
         for(char c: t.toCharArray()){
            if(map1.containsKey(c) && map1.get(c)>0){
                map1.put(c,map1.get(c)-1);
            }
            else{
                steps++;
            }
         }
         
         return steps;
         


        
    }
}