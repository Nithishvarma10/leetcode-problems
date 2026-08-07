class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int n=asteroids.length;
        boolean all=false;
        long currmass=mass;
        for(int i=0;i<n;i++){
            if(currmass>=asteroids[i]){
                currmass+=asteroids[i];
                all=true;
               

            }
            else{
                all=false;
                break;
            }

        }
        return all;
    }
}