class Solution {
    public int removeElement(int[] nums, int val) {
        int write = 0, k=0;

        for(int read =0 ; read< nums.length ; read++)
        {
            if(nums[read]!= val)
            {
                int temp = nums[read];
                nums[read]= nums[write];
                nums[write]= temp;
                write++;
            }
            else
            {
                k++;
            }
        }

        return nums.length-k;
        
    }
}