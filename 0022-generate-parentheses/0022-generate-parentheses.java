class Solution {
    ArrayList<String> an = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        ans("",0,0,n);
        return an;
    }
        public void ans(String s , int o,int c,int n){
            if(s.length() == n*2){
                an.add(s);
                return ;
            }
            if(o<n){
                ans(s+"(",o+1,c,n);}
            if(c<o){
                ans(s+")",o,c+1,n);
            }

        }
     
}