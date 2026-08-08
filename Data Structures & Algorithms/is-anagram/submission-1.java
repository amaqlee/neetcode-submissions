class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }else if(s.equals(t)){
            return true;
        }

        Map<String, Integer> sCount = new TreeMap<>();
        Map<String, Integer> tCount = new TreeMap<>();

        for(int i = 0; i < s.length(); i++){
            String sChar = s.substring(i, i+1);
            String tChar = t.substring(i, i+1);
            
            if(sCount.containsKey(sChar)){
                sCount.put(sChar, sCount.get(sChar) + 1);
            }else{
                sCount.put(sChar, 0);
            }

            if(tCount.containsKey(tChar)){
                tCount.put(tChar, tCount.get(tChar) + 1);
            }else{
                tCount.put(tChar, 0);
            }
        }

        for(String str : sCount.keySet()){
            int sVal = sCount.get(str);
            if(!tCount.containsKey(str)){
                return false;
            }
            int tVal = tCount.get(str);
            if(sVal != tVal){
                return false;
            }
        }
        return true;
    }
}
