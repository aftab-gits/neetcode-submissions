class Solution {
    public String longestCommonPrefix(String[] strs) {

        String first = strs[0];

        char[] ans = new char[first.length()];
        int count = 0;

        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (i > strs[j].length()-1 || ch != strs[j].charAt(i)) {
                    return new String(ans, 0, count);
                }
            }

            ans[count] = ch;
            count++;
        }

        return new String(ans, 0, count);

        

        
        
    }
}