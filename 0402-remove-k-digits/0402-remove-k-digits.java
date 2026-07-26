class Solution {
    public String removeKdigits(String num, int k) {
       Stack<Integer> st=new Stack<>();
       for(char c: num.toCharArray()){
        int x=Character.getNumericValue(c);
        while(!st.isEmpty() && st.peek()>x && k>0){
            st.pop();
            k--;
        }
        st.push(x);
       }
       while(k>0){
        st.pop();
        k--;
       } 
       StringBuilder sb=new StringBuilder();
       while(!st.isEmpty()){
        sb.append(st.pop());
       }
       sb.reverse();
       while(sb.length()>1 && sb.charAt(0)=='0'){
        sb.deleteCharAt(0);
       }
       if(sb.length()==0){
        return "0";
       }
       return sb.toString();

    }
}