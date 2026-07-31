class Solution {
    public int minimumPushes(String word) {
        int freq[]=new int[26];
        for(char c: word.toCharArray()){
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        int sum=0;
        int index=0;
        for(int i=25;i>=0;i--){
            sum+=((index++/8)+1)*freq[i];

        }
        return sum;
        
    }
}