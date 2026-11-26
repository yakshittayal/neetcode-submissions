class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty()){
            return true;
        }
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(char cha: ch){
            if(cha== '{'){
                st.push('}');
            } else if(cha== '(' ){
                st.push(')');
            } else if(cha== '[' ){
                st.push(']');
            } else {
                if(st.isEmpty() || cha != st.peek()){
                    return false;
                } 
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
