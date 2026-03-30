class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int i = s.length() - 1, j = s.length() - 1;
        StringBuilder res = new StringBuilder();
        while(i >= 0){
            if(s.charAt(i) != ' '){
                j = i;
                while(i >= 0 && s.charAt(i) != ' ' ){
                    i--;
                }
                res.append(s.substring(i + 1, j + 1) + " ");
            }
            else {
                i--;
            }
        }
        return res.toString().trim();
    }
}