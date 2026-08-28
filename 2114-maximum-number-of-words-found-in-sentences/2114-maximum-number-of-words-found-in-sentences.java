class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        int n=sentences.length;
        for(int i=0;i<n;i++){
            String[] words=sentences[i].trim().split("\\s+");
            int count=(sentences[i].trim().isEmpty()?0:words.length);
            max=Math.max(max,count);
        }
        return max;
    }
}