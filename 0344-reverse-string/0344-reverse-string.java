class Solution {

        static void f(int l , int r , char[] s){
            if(l>=r){
                return;
            }
            char temp = s[l];
            s[l]=s[r];
            s[r]=temp;
            f(l+1,r-1,s);
        }
        public void reverseString(char[] s) {
            f(0,s.length-1,s);
        

    }
}