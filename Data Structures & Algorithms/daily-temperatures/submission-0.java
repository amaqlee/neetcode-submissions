class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //monotonic decreasing stack: always in decreasing order
        int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>(); //pair: [temp, index]

        for(int i = 0; i < temperatures.length; i++){
            int t = temperatures[i];

            while(!stack.isEmpty() && t > stack.peek()[0]){
                int[] pair = stack.pop();
                //set index of curr temp @ result to diff between curr index and greater index
                result[pair[1]] = i - pair[1];
            }
            stack.push(new int[]{t, i});
        }
        return result;
    }
}
