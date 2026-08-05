class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char character: s.toCharArray()) {
            map.put(character, map.getOrDefault(character, 0) + 1);
        }
        
        for (int i = 0; i < t.length(); i++) {
            char currentCharacter = t.charAt(i);
            if (!map.containsKey(currentCharacter)) {
                return false;
            }
            map.put(currentCharacter, map.get(currentCharacter) - 1);
            if (map.get(currentCharacter) == 0) {
                map.remove(currentCharacter);
            }
        }
        return map.isEmpty();
    }
}
