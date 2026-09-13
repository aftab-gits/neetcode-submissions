class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        Map<String , List<String>> map =  new HashMap<>();

        for(String str : strs)
        {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String string = new String(arr);

            if(!map.containsKey(string))
            {
                map.put(string , new ArrayList<>());
                map.get(string).add(str);
            }
            else
            {
                map.get(string).add(str);
            }
        }

        return new ArrayList<>(map.values());


        
    }
}
