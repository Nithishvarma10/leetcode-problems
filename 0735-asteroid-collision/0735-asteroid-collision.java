class Solution {
    public int[] asteroidCollision(int[] asteroids) {
    int n=asteroids.length;
   
    Stack<Integer> st=new Stack<>();
    for(int i=0;i<n;i++){
                  boolean des=false;
        while(!st.isEmpty() && (st.peek()>0 && asteroids[i]<0)){
            
            if(st.peek()<Math.abs(asteroids[i])){
                st.pop();
            }else if(st.peek()==Math.abs(asteroids[i])){
                st.pop();
                des=true;
                break;

            }else{
                des=true;
                break;
            }
                
                
        }
        if(!des){
        st.push(asteroids[i]);
        }
    }
    int arr[]=new int[st.size()];
    int indx=st.size()-1;
    while(!st.isEmpty()){
        arr[indx--]=st.pop();
    }
    return arr;
    }
}