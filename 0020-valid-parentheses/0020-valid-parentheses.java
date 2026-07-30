class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        boolean flag = true;
        for(int i = 0;i<s.length();i++){
            char a = s.charAt(i);
            if(a=='('|| a=='{'|| a=='['){
                st.push(a);
            }
            else{
                if(!st.isEmpty()&&((a==')' && st.peek()=='(') || (a=='}' && st.peek()=='{') || (a==']' && st.peek()=='['))){
                    st.pop();
                }
                else{
                    flag= false;
                }

            }
        } 
        if(st.isEmpty() && flag==true){
            return true;
        }
        else{
            return false;
        }
    }
}