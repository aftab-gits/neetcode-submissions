class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] ans = new int[nums.length];
        // int prd;
        
        int[] leftproduct = new int[nums.length];
        leftproduct[0] = 1;
        for(int i=1 ; i<nums.length ; i++)
        {
            leftproduct[i] = leftproduct[i-1]*nums[i-1];
        }

        int[] rightproduct = new int[nums.length];
        rightproduct[nums.length-1] = 1;

        for(int i=nums.length-2 ;i>=0; i--)
        {
            rightproduct[i] = rightproduct[i+1] * nums[i+1];
        }

        for(int i =0; i<nums.length ;i++)
        {
            ans[i] =leftproduct[i] * rightproduct[i];
        } 

        return ans;




        

        

        

    }
}