import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, int[]> d = new HashMap<>();

        for (int id = 0; id < s.length(); id++){
            char ch = s.charAt(id);
            if(!d.containsKey(ch)){
                d.put(ch, new int[]{id, 1}); 
            }else{
                d.get(ch)[1]++;
            }
        }

        for (char ch : s.toCharArray()){
            int[] val = d.get(ch);
            if (val[1] == 1) {
                return val[0];
            }
        }
        return -1;
    }
}