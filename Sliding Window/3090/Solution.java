java.util.Map;

class Solution {
    public int maximumLengthSubstring(String s) {
        int l = 0, r = 0, _max = 1;
        Map<Character, Integer> counter = new HashMap<>();
        counter.put(s.charAt(0), 1);

        while (r < s.length() -1){
            r++;
            char currentChar = s.charAt(r);
            /*
             * Aqui agente ja adicionou o primeiro caracter, agora aqui
             * vamos ver se esse item ja está no no dicionario
             * se ja tivar vamos adicionar 1,
             * se não tiver vamos criar ele 
             */
            if(counter.containsKey(currentChar)){
                counter.put(currentChar, counter.get(currentChar) + 1);
            } else {
                counter.put(currentChar, 1);
            }
            while (counter.get(currentChar) == 3){
                counter.put(s.charAt(l), counter.get(s.charAt(l)) - 1);
                l++;
            }
            _max = Math.max(_max, r-l + 1);
        }
        return _max;
    }
}
