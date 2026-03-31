class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> sta = new Stack<>();

        for (int i = 0; i < op.length; i++) {
            if (op[i].equals("C")) {
                sta.pop();
            } 
            else if (op[i].equals("D")) {
                sta.push(sta.peek() * 2);
            } 
            else if (op[i].equals("+")) {
                int temp = sta.pop();
                int sum = sta.peek() + temp;
                sta.push(temp);
                sta.push(sum);
            } 
            else {
                sta.push(Integer.parseInt(op[i]));
            }
        }

        int sum = 0;
        while (!sta.isEmpty()) {
            sum += sta.pop();
        }

        return sum;
    }
}