class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int len=0;
        boolean odd=false;
        for(Map.Entry<Character,Integer> e: map.entrySet()){
            int key=e.getKey();
            int value=e.getValue();
            if(value%2==0){
                len+=value;
            }
            else{
                
                    len+=value-1;
                    odd=true;

                

            }


        }
        if(odd){
            len+=1;
        }
        return len;
        

    }
}