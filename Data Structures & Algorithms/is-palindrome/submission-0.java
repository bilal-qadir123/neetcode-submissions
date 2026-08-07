class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                string.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        if (string.toString().equals(string.reverse().toString())) {
            return true;
        }
        return false;
    }
}
