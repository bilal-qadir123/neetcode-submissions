class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();

        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        while (!s.isEmpty()) {
            boolean removed = false;

            for (int i = 0; i < s.length() - 1; i++) {
                char opening = s.charAt(i);

                if (map.containsKey(opening) &&
                    map.get(opening) == s.charAt(i + 1)) {

                    s = s.substring(0, i) + s.substring(i + 2);
                    removed = true;
                    break;
                }
            }

            if (!removed) {
                return false;
            }
        }

        return true;
    }
}