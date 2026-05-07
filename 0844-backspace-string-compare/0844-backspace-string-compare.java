class Solution {
    public String backSpacing(String s){
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(!res.isEmpty() && s.charAt(i) == '#'){
                res = new StringBuilder(res.substring(0, res.length() - 1));
            }
            else if(s.charAt(i) != '#') res.append(s.charAt(i));
        }
        return res.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        return backSpacing(s).equals(backSpacing(t));
    }
}