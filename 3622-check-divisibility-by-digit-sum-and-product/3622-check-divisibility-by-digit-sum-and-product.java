class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prd=1;
        int temp=n;
        while(n!=0){
            int dig=n%10;
            sum+=dig;
            prd*=dig;
            n/=10;


        }
        int tsum=sum+prd;
        if(temp%tsum==0){
            return true;
        }
        return false;
    }
}