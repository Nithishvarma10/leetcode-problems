class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> set=new HashSet<>();
        for(char c:password.toCharArray()){
            set.add(c);
        }
        int sum=0;
        for(char s:set){
            if(Character.isLowerCase(s)){
                sum+=1;
            }
            else if(Character.isUpperCase(s)){
                sum+=2;
            }
            else if(Character.isDigit(s)){
                sum+=3;
            }
            else {
                sum+=5;
            }

            
        }
        return sum;
    }
}