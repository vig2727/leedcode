class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int i = s.length()-1;
        int l =0;

        while(i>=0 && s.charAt(i)!=' '){
            i=i-1;
            l=l+1;
        }
        
        return l;
        
    }
}