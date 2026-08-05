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
            if (!map.containsKey(t.charAt(i))) {
                return false;
            }
            if (map.get(t.charAt(i)) == 0) {
                map.remove(t.charAt(i));
                continue;
            }
            char currentCharacter = t.charAt(i);
            map.put(currentCharacter, map.get(currentCharacter) - 1);
        }
        return map.isEmpty();
    }
}
