class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<ArrayList<Integer>, ArrayList<String>> freqToStrings = new HashMap<>();
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", 
            "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        //create hashmap with frequencies of ea letter in alphabet
        for(int i = 0; i < strs.length; i++){ //every string in list
            ArrayList<Integer> freq = new ArrayList<>(); //stores frequency of each letter in alphabet
            String st = strs[i]; //gets string @ this index
            for(int l = 0; l < 26; l++){
                int count = 0;
                for(int j = 0; j < st.length(); j++){ //every char in string
                    if(st.substring(j, j+1).toLowerCase().equals(alphabet[l])){ 
                    // compare char @ index to alphabet
                        count += 1;
                    }
                }
                freq.add(count);
            }
            
            if(!freqToStrings.containsKey(freq)){
                freqToStrings.put(freq, new ArrayList<>());
            }
            freqToStrings.get(freq).add(st);
        }
        List<List<String>> result = new ArrayList<>(freqToStrings.values());
        return result;
    }
}
