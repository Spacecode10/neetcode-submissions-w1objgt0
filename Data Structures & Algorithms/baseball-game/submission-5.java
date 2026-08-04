class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> arr = new Stack<>();

        for (int i = 0; i < op.length; i++) {
            if (op[i].equals("C")) {
                arr.pop();
            } 
            else if (op[i].equals("D")) {
                arr.push(arr.peek() * 2);
            } 
            else if (op[i].equals("+")) {
                int temp = arr.pop();
                int sum = arr.peek() + temp;
                arr.push(temp);
                arr.push(sum);
            } 
            else {
                arr.push(Integer.parseInt(op[i]));
            }
        }

        int sum = 0;
        while (!arr.isEmpty()) {
            sum += arr.pop();
        }

        return sum;
    }
}