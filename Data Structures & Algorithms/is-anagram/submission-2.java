class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> sCount = new HashMap<>();
        Map<Character, Integer> tCount = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char currS = s.charAt(i);
            sCount.put(currS, sCount.getOrDefault(currS, 0) + 1);
            char currT = t.charAt(i);
            tCount.put(currT, tCount.getOrDefault(currT, 0) + 1);
        }

        return sCount.equals(tCount);
    }
}
