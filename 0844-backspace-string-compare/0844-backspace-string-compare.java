class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        int cntS = 0;
        int cntT = 0;
        while(i >= 0 || j >= 0){
            while(i >= 0){
                if(s.charAt(i) == '#'){
                    cntS++;
                    i--;
                }
                else if(cntS > 0){
                    i--;
                    cntS--;
                }
                else {
                    break; //xoa xong
                }
            }
            while(j >= 0){
                if(t.charAt(j) == '#'){
                    cntT++;
                    j--;
                }
                else if(cntT > 0){
                    j--;
                    cntT--;
                }
                else {
                    break;
                } 
            }
            if(i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) return false;
if ((i >= 0) != (j >= 0)) {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}