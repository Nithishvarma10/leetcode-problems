class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int temp=i;
            boolean flag=false;
            while(temp!=0){
                int dig=temp%10;

                if(dig!=0 && i%dig==0 ){
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                }
                temp/=10;
                
            }
            if(flag){
                arr.add(i);
            }
        }
        return arr;
    }
}