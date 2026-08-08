class Solution {
    public boolean isValid(String s) {
        int low = 0;
        int high = s.length() - 1;
        
        HashMap<Character, Character> map = new HashMap<>();
        
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        while (low < high) {
            char openingBracket = s.charAt(low);

            if (!map.containsKey(openingBracket)) {
                return false;
            }
            char closingBracket = map.get(openingBracket);
            
            if (s.charAt(high) != closingBracket) {
                return false;
            }
            low ++;
            high --;
        }
        return true;
    }
}
