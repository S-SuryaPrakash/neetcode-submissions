class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int i=0;
        int sum = 0;
        for (String token : tokens) {
            if (
                !token.equals("+") &&
                !token.equals("-") &&
                !token.equals("*") &&
                !token.equals("/")
            ) {
                st.push(Integer.parseInt(token));
            }
            else {

                int op2 = st.pop();
                int op1 = st.pop();

                if (token.equals("+")) {
                    st.push(op1 + op2);
                }
                else if (token.equals("-")) {
                    st.push(op1 - op2);
                }
                else if (token.equals("*")) {
                    st.push(op1 * op2);
                }
                else {
                    st.push(op1 / op2);
                }
            }
        }
        return st.pop();
    }
}