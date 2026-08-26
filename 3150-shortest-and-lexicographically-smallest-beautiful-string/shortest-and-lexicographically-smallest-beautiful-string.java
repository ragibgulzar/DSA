class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();

        for(int len = k; len <= n; len++){
            String result = "";
            for(int start = 0; start + len <= n; start++){
                String temp = s.substring(start,start + len);
                int cnt = 0;
                for(char c: temp.toCharArray()){
                    cnt += (c == '1') ? 1 : 0;
                }
                if(cnt==k){
                    if(result.isEmpty()|| temp.compareTo(result) < 0){
                        result = temp;
                    }
                }
            }
            if(!result.isEmpty()){
            return result;
        }
        }
        
        return "";

    }
}