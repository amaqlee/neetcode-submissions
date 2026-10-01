class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> countsToString = 
                    new HashMap<>();
        for(String str : strs){
            Map<Character, Integer> charToCount = new HashMap<>();
            for(int i = 0; i < str.length(); i++){
                char curr = str.charAt(i);
                int currCount = 0;
                if(charToCount.containsKey(curr)){
                    currCount = charToCount.get(curr);
                }
                charToCount.put(curr, currCount + 1);
            }
            List<String> temp = new ArrayList<>();
            if(countsToString.containsKey(charToCount)){
                temp = countsToString.get(charToCount);
            }
            temp.add(str);
            countsToString.put(charToCount, temp);
        } 

        List<List<String>> result = new ArrayList<>();

        for(Map<Character, Integer> count : countsToString.keySet()){
            result.add(countsToString.get(count));
        }

        return result;
    }
}
