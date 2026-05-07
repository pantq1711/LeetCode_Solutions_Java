class Solution {
    public String decodeString(String s) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<StringBuilder> stack2 = new Stack<>();
        int curNum = 0;
        StringBuilder curStr = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                curNum = curNum * 10 + c - '0';
            }
            else if(Character.isLetter(c)){
                curStr.append(c);
            }
            else if(c == '['){
                stack1.push(curNum);
                stack2.push(curStr);
                curNum = 0;
                curStr = new StringBuilder();
            }
            else {
                StringBuilder tmp = stack2.pop();
                int cnt = stack1.pop();
                for(int j = 0; j < cnt; j++){
                    tmp.append(curStr);
                }
                curStr = tmp;
            }
        }
        return curStr.toString();
    }
}