class Solution {
    public int firstMissingPositive(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;    
        int res=0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0 ;i < nums.length; i++)
        {
            max =  Math.max(nums[i],max);
            min =  Math.max(nums[i],min);
        }

        
        
        for(int key : nums)
        {
            map.put(key, map.getOrDefault(key,0)+1);
        }

        for(int i=1; i<=max ; i++)
        {
            if(!map.containsKey(i))
            {
                res= i;
                break;
            }
        }
        if(res==0)
        {
            res= max+1;
        }
        if(max<0)
        {
            res= 1;
        }

        return res;
        
    }
}