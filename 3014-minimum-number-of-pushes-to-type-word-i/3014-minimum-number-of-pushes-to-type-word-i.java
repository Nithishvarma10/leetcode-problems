class Solution {
    public int minimumPushes(String word) {
        int n=word.length();

        int sums=0;
        for(int i=0;i<n;i++){
           sums+=(i/8)+1;
           
        }
       
        return sums;
    }
}