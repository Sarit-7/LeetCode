class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int depth = 0,maxdepth = 0;    
        for(int i = 0 ; i < n ; i++)
        {
                if(s.charAt(i)=='(')
                        depth++;
                else if (s.charAt(i)==')')
                        depth--;
                maxdepth = Math.max(depth,maxdepth);
        } 
            return maxdepth;
    }
}