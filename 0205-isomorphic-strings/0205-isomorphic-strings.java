class Solution {
    public boolean isIsomorphic(String s, String t) {
         Map<Character, Character> m = new HashMap<>();

    for (int i = 0; i < s.length(); i++)
    {

      char original = s.charAt(i);
      char replacement = t.charAt(i);

      if (!m.containsKey(original)) 
      {
        if (!m.containsValue(replacement))
          m.put(original, replacement);
        else
          return false;
      }
      else 
      {
        char ch = m.get(original);
        if (ch != replacement)
          return false;
      }
    }

    return true;
    }
}