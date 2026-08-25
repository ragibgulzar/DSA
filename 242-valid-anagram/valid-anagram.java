class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            char y = t.charAt(i);

            freq[x-'a']++;
            freq[y-'a']--;
        }

        for(int c: freq){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}