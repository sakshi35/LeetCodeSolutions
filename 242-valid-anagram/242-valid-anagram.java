class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        if (s.length() != t.length()) {
            return false;
        }
        
        for (int i=0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        
        for (int i=0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            }
        }
        
        System.out.println("map.size(): "+map.size());

        
        for (char c : map.keySet()) {
            if (map.get(c) != 0) {
                return false;
            }
        }
        return true;
        
    }
}