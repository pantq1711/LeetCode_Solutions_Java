class Solution {
    public int sumNum(int n){
        int sum = 0;
        while(n > 0){
            int tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        while(n != 1 && n != 4){
            n = sumNum(n);
        }
        return n == 1;
    }
}