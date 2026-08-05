class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> stringOneMap = new HashMap<>();
        HashMap<Character, Integer> stringTwoMap = new HashMap<>();

        for (char stringOneCharacter: s.toCharArray()) {
            stringOneMap.put(stringOneCharacter, stringOneMap.getOrDefault(stringOneCharacter, 0) + 1);
        }

        for (char stringTwoCharacter: t.toCharArray()) {
            stringTwoMap.put(stringTwoCharacter, stringTwoMap.getOrDefault(stringTwoCharacter, 0) + 1);
        }

        for (Map.Entry<Character, Integer> loopEntry : stringOneMap.entrySet()) {
            char mapOneCharacter = loopEntry.getKey();
            int mapOneCharacterCount = loopEntry.getValue();

            if (!stringTwoMap.containsKey(mapOneCharacter)) {
                return false;
            }
            
            if (stringTwoMap.get(mapOneCharacter) != mapOneCharacterCount) {
                return false;
            }
        }
        return true;
    }
}
