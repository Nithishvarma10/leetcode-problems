class Solution {
    public int countValidPrefixes(String s) {
      int count=0;
        int zero=0;
        int one =0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='0'){
                zero++;
            }
            else{
                one++;
            }
            if((zero==one) || (zero-1==one) ||(one-1==zero)){
                count++;
            }
            
            
        }
        return count;
    }
}