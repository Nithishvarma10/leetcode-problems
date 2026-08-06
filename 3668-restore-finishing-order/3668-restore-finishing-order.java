class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set=new HashSet<>();
        for(int fr:friends){
            set.add(fr);
        }
        int indx=0;
        int arr[]=new int[friends.length];
        for(int num:order){
            if(set.contains(num)){
                arr[indx++]=num;
            }

        }
        return arr;
    }
}