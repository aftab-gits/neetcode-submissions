class Solution {
    public boolean validPalindrome(String s) {

        char[] str = s.toCharArray();

        // int low=0, high = str.length;
        int pointer=0;

        for(int i=0 ; i< str.length ;i++)
        {
            
            boolean isPallindrome = testPallindrome(str,pointer);
            if(isPallindrome == true)
            {
                return true;
            }
            // low++;
            // high--;
            pointer++;
        }

        return false;


        
    }

    public static boolean testPallindrome( char[] arr, int pointer)
    {   
        int low=0;
        int high= arr.length-1;
        while(low<=high)
        {   if(low!= pointer && high != pointer)
            { 
               if(arr[low]==arr[high])
                {
                    low++;
                    high--;
                }
                else
                {
                    return false;
                }
            }
            else{
                if(low== pointer)
                {
                    low++;
                }
                else
                {
                    high--;
                }
            }
        }
        return true;
    }
}