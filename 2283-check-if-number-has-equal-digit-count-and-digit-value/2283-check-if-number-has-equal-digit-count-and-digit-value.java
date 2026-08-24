class Solution {
    public boolean digitCount(String num) {
        int len=num.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for (char c : num.toCharArray()) {

            map.put(c, map.getOrDefault(c, 0) + 1);

        }

        for (int i = 0; i < num.length(); i++) {

            char digit = (char) (i + '0');

            int expected = num.charAt(i) - '0';

            if (map.getOrDefault(digit, 0) != expected) {

                return false;

            }

        }

        return true;
    }
}