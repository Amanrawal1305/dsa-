class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortstr = new String(chars);
            
            if (!map.containsKey(sortstr)) {
                map.put(sortstr, new ArrayList<>());
            }
            
            map.get(sortstr).add(word);
        }
        
        return new ArrayList<>(map.values());
    }
}