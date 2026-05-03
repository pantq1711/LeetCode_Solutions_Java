class Solution {
    public String decodeString(String s) {
        int curNum = 0;
        StringBuilder curStr = new StringBuilder();
        Stack<Integer> num = new Stack<>();
        Stack<StringBuilder> stringBuilders = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                curNum = curNum * 10 + c - '0';
            }
            else if(Character.isLetter(c)){
                curStr.append(c);
            }
            else if(c == '['){
                num.push(curNum);
                stringBuilders.push(curStr);
                curNum = 0;
                curStr = new StringBuilder();
            }
            else {
                int count = num.pop();
                StringBuilder str = stringBuilders.pop();
                for(int j = 0; j < count; j++){
                    str.append(curStr);
                }
                curStr = str;
            }

        }
        return curStr.toString();
    }
}