class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(n!=0){
            int di=n%10;
            arr.add(di);
            n/=10;
        }
        Collections.sort(arr);
        int r=arr.size()-1;
        return arr.get(r)*arr.get(r-1);
    }
}