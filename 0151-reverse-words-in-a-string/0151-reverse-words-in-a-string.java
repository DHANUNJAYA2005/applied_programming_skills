class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        String ans = "";

        StringBuilder sb = new StringBuilder("");

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        String word = sb.toString();

        for (int i = 0; i < n; i++) {

            while (i < word.length() && word.charAt(i) == ' ') {
                i++;
            }

            String word2 = "";

            while (i < word.length() && word.charAt(i) != ' ') {
                word2 += word.charAt(i);
                i++;
            }

            word2 = new StringBuilder(word2).reverse().toString();

            if (word2.length() > 0) {
                if (ans.length() > 0) {
                    ans += " ";
                }
                ans += word2;
            }
        }

        return ans;
    }
}