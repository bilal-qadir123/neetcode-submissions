class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char stringOneCharacters: s.toCharArray()) {
            map1.put(stringOneCharacters, map1.getOrDefault(stringOneCharacters, 0) + 1);
        }

        for (char stringTwoCharacters: t.toCharArray()) {
            map2.put(stringTwoCharacters, map2.getOrDefault(stringTwoCharacters, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();

            if (!map2.containsKey(character)) {
                return false;
            }
            
            if (map2.get(character) != count) {
                return false;
            }
        }
        return true;
    }
}
