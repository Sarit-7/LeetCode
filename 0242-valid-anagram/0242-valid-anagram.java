class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
                return false;
            char c1[]= s.toCharArray();
            Arrays.sort(c1);
            String s1 = Arrays.toString(c1);
            
            char c2[]= t.toCharArray();
            Arrays.sort(c2);
            String t1 = Arrays.toString(c2);
            
            return s1.equals(t1);
            
    }
}