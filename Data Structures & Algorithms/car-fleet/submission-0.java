class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        //rows: ea car
        //col 0: position
        //col 1: speed
        int[][] pairs = new int[position.length][2];
        for(int i = 0; i < position.length; i++){
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }

        //a and b represent rows (cars) in 2d arr
        //comparing b[0] to a[0] sorts in descending order
        //sorted from closest to furthest
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));

        Stack<Double> s = new Stack<>();
        for(int[] p : pairs){
            s.push((double) (target - p[0])/p[1]);
            //if new car time (further) is less than time before it (closer)
            //then new car catches up, so it should be popped
            if(s.size() >= 2 && s.peek() <= s.get(s.size() - 2)){
                s.pop();
            }
        }
        return s.size();
    }
}
