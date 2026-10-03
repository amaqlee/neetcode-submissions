class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> sortToList = new HashMap<>();
        for(String s : strs){
            //sort string alphabetically
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String newS = new String(str);
            List<String> temp = new ArrayList<>();
            if(sortToList.containsKey(newS)){
                temp = sortToList.get(newS);
            }
            temp.add(s);
            sortToList.put(newS, temp);
        }

        for(String s : sortToList.keySet()){
            result.add(sortToList.get(s));
        }

        return result;
    }
}
