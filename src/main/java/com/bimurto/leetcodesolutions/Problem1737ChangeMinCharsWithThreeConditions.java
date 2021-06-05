package com.bimurto.leetcodesolutions;

public class Problem1737ChangeMinCharsWithThreeConditions {
    public int minCharacters(String a, String b) {
        char a_min = 'z';
        char b_min = 'z';
        char a_max = 'a';
        char b_max = 'a';
        int[] a_char_count = new int[26];
        int[] b_char_count = new int[26];
        int[] char_count = new int[26];
        int a_max_char_count = 0;
        int b_max_char_count = 0;
        int max_char_count = 0;
        for(char ch : a.toCharArray()){
            if(ch < a_min){
                a_min = ch;
            }
            if(ch > a_max){
                a_max = ch;
            }
            a_char_count[ch - 'a'] ++;

            char_count[ch - 'a'] ++;
            if(char_count[ch - 'a'] > max_char_count){
                max_char_count = char_count[ch - 'a'];
            }
        }

        for(char ch : b.toCharArray()){
            if(ch < b_min){
                b_min = ch;
            }
            if(ch > b_max){
                b_max = ch;
            }
            b_char_count[ch - 'a'] ++;


            char_count[ch - 'a'] ++;
            if(char_count[ch - 'a'] > max_char_count){
                max_char_count = char_count[ch - 'a'];
            }
        }

        // Case 1: make all same char

        int case1 = (a.length() + b.length()) - max_char_count;

        // Case 2: change one string with the highest char
        int case2 = Integer.MAX_VALUE;
        if (a_max > b_max){
            case2 = a.length() - getHighestCharCount(a_char_count);
        }else if (b_max > a_max){
            case2 = b.length() - getHighestCharCount(b_char_count);
        }else {
            if(a_max == 'z')
                case2 = case1;
            else{
                case2 = Math.min(a.length(), b.length());
            }
        }

        // Case 3: change one string with the lowest char
        int case3 = Integer.MAX_VALUE;
        if (a_min < b_min){
            case3 = a.length() - getSmallestCharCount(a_char_count);;
        }else if (b_min < a_min){
            case3 = b.length() - getSmallestCharCount(b_char_count);;
        }else {
            if(a_min == 'a')
                case3 = case1;
            else{
                case3 = Math.min(a.length(), b.length());
            }
        }
        return 0;
    }

    private int getHighestCharCount(int[] x){
        for (int i = x.length - 1; i >= 0; i--) {
            if(x[i] != 0 ) return x[i];
        }
        return 0;
    }

    private int getSmallestCharCount(int[] x){
        for (int j : x) {
            if (j != 0) return j;
        }
        return 0;
    }

}
