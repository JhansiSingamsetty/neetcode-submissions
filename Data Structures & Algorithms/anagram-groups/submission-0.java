class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length;i++){
            char[] chAr = strs[i].toCharArray();
            Arrays.sort(chAr);
            String st = String.valueOf(chAr);
            map.computeIfAbsent(st, k -> new ArrayList()).add(strs[i]);
        }
        return new ArrayList(map.values());
        
    }
}
