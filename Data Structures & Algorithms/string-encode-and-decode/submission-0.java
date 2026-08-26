class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        for(String s: strs){
            encoded += String.valueOf(s.length()) + "#" + s;
        }
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        
        while(i < str.length()){
            int j = i;
            while(!str.substring(j, j+1).equals("#")){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            String word = str.substring(j+1, j+1+length);
            result.add(word);
            i = j + 1 + length;
        }
        return result;
    }
}
