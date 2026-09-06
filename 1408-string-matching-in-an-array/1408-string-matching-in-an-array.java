class Solution {
    public List<String> stringMatching(String[] words) {
        int n=words.length;
        List<String> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j!=i && words[j].contains(words[i])){
                    if(!ls.contains(words[i])){
                        ls.add(words[i]);
                    }

                }
            }
        }
        return ls;
    }
}