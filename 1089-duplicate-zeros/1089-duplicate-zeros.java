class Solution {
    public void duplicateZeros(int[] arr) {
        int cnt = 0, length = arr.length - 1;
        for(int i = 0; i <= length - cnt; i++){
            if(arr[i] == 0){

                if(i == length - cnt){
                    arr[length] = 0;
                    length--;
                    break;
                }
                cnt++;
            }
        }
        for(int i = length - cnt; i >= 0; i--){
            if(arr[i] == 0){
                arr[i + cnt] = 0;
                cnt--;
                arr[i + cnt] = 0;
            }
            else arr[i + cnt] = arr[i];
        }
    }
}