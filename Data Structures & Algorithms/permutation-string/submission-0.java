class Solution {
    public boolean checkInclusion(String s1, String s2) {

        char[] s11 = s1.toCharArray();
        char[] s22 = s2.toCharArray();

        if(s1.length() > s2.length())
        {
            return false;
        }

        int left=0;

        int[] freq = new int[26];
        int[] curr = new int[26];

        for(int i =0 ; i<s11.length ; i++ )
        {
            freq[s11[i]-'a']++;

        }

        for(int right=0 ; right<s22.length; right++)
        {
            curr[s22[right]-'a']++;

            if(right-left+1 > s11.length)
            {
                curr[s22[left]-'a']--;
                left++;
            }

            if(right-left+1 == s11.length && matches(curr,freq))
            {
                return true;
            }
        }


        return false;
        
    }


    public static boolean matches(int[] curr1, int[] freq1 )
    {
        for(int i=0 ; i<26; i++)
        {
            if(curr1[i]!=freq1[i])
            {
                return false;
            }
        }

        return true;


    }
}