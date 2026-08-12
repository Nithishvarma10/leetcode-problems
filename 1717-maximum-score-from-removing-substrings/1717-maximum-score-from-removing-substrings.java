class Solution {
    public int maximumGain(String s, int x, int y) {
        int gain=0;
       
        if(x>y){
             Stack<Character> st=new Stack<>();
         for(char c:s.toCharArray()){
            if(!st.isEmpty() && (st.peek()=='a' && c=='b')){
                st.pop();
                gain+=x;
            }else{
            
            
            st.push(c);
            }
         }
        
        
         Stack<Character> st2 = new Stack<>();

            for (char c : st) {

                if (!st2.isEmpty() && st2.peek() == 'b' && c == 'a') {

                    st2.pop();

                    gain += y;

                } else {

                    st2.push(c);

                }

            }
        }
        else{
            Stack<Character> st=new Stack<>();
            for(char c:s.toCharArray()){
            if(!st.isEmpty() && (st.peek()=='b' && c=='a')){
                st.pop();
                gain+=y;
            }
            else{
            st.push(c);
            }
            }
       

            Stack<Character> st2 = new Stack<>();

            for (char c : st) {

                if (!st2.isEmpty() && st2.peek() == 'a' && c == 'b') {

                    st2.pop();

                    gain += x;

                } else {

                    st2.push(c);

                }

            }
        
         
            
            
          
         }
        
        

        return gain;
    }
}