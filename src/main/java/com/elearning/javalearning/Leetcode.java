package com.elearning.javalearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class Leetcode {

    public static void main(String[] args) {
        SpringApplication.run(Leetcode.class, args);
    }
    public int removeDuplicates(int[] nums) {
        int k = 0, curNum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(curNum != nums[i]){
                curNum = nums[i];
                nums[++k] = curNum;
            }
        }
        return k + 1;
    }
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i - 1];
        }
    }
    public int firstUniqChar(String s) {
        int cnt[] = new int[26];
        for(char x : s.toCharArray()) cnt[x - 'a']++;
        for(int i = 0; i < s.length(); i++){
            if(cnt[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if(x == '(' || x == '{' || x == '['){
                stack.push(x);
            }

            else {
                if(stack.isEmpty()) return false;
                Character top = stack.pop();
                if(x == ')' && top != '(') return false;

            }
        }



    }
    public void reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        while(l < r){
            char tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
            l++;
            r--;
        }
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        int cnt[] = new int[26];
        for(char x : magazine.toCharArray()){
            cnt[x - 'a']++;
        }
        for(char x : ransomNote.toCharArray()){
            cnt[x - 'a']--;
            if(cnt[x - 'a'] < 0) return false;
        }
        return true;
    }
    public String reverseWords(String s) {
        s = s.trim();
        int i = s.length() - 1, j = s.length() - 1;
        StringBuilder res = new StringBuilder();
        while(i >= 0){
            if(s.charAt(i) != ' '){
                j = i;
                while(s.charAt(i) != ' ' && i >= 0){
                    i--;
                }
                res.append(s.substring(i + 1, j + 1) + " ");
            }
            else {
                i--;
            }
        }
        return res.toString();
    }
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int num : nums){
            res ^= num;
        }
        return res;
    }
    public int majorityElement(int[] nums) {
        int cnt = 0, res = 0;
        for(int num : nums){
            if(cnt == 0) res = num;
            cnt += (res == num) ? 1 : -1;
        }
        return res;
    }
    public void reverse(int [] nums, int l, int r){
        while(l < r){
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }
    }

    public void rotate(int[] nums, int k) {
        int l = 0, r = nums.length - 1;
        reverse(nums, l, r);
        reverse(nums, 0, k);
        reverse(nums, k, r);
    }
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }
        int nums[] = new int[digits.length + 1];
        nums[0] = 1;
        return nums;
    }
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = (int) (len * (len + 1) / 2);
        int sumExceptRes = 0;
        for(int num : nums) sumExceptRes += num;
        return sum - sumExceptRes;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        boolean exists[] = new boolean[1001];
        int res[] = new int[1001];
        for(int num : nums1){
            exists[num] = true;
        }
        int cnt = 0;
        for(int num : nums2){
            if(exists[num]){
                res[cnt++] = num;
                exists[num] = false;
            }
        }
        return Arrays.copyOfRange(res, 0, cnt);
    }
    public int pivotIndex(int[] nums) {
        int leftSum = 0, sum = 0;
        for(int num : nums) sum += num;
        for(int i = 0; i < nums.length; i++){
            if(leftSum == sum - leftSum - nums[i]){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if(prefix.isEmpty()) return "";
        }
        return prefix;
    }
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while(j < t.length() ){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int tmp = x;
        int rev = 0;
        while(tmp > 0){
            rev = rev * 10 + tmp % 10;
            tmp /= 10;
        }
        return x == rev;
    }

}