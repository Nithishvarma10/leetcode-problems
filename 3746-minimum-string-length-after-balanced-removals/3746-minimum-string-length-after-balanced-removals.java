class Solution {
    public int minLengthAfterRemovals(String s) {
        Stack<Character> st=new Stack<>();
        for(char c: s.toCharArray()){
            if(!st.isEmpty() && st.peek()=='a' && c=='b'){
                st.pop();

            }
            else if(!st.isEmpty() && st.peek()=='b' && c=='a'){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        return st.size();
    }
}