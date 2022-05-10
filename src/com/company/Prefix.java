package com.company;

class Prefix {
    public static Object prefix(String[] array) {
        int minlen = 10;
        String shortest_word = "";
        for (String s : array) {
            if (s.length() < minlen) {
                minlen = s.length();
                shortest_word = s;
            }
        }
        for (int i = 0; i < minlen ; i++) {
            boolean ref = true;
            String substr =  shortest_word .substring( 0,  shortest_word .length() - i );
            for (String s : array) {
                if (!s.startsWith( substr )) {
                    ref = false;
                    break;
                }
            }
            if (ref){
                return substr;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String[] array = {"abc", "abcd", "abfce", "abcac"} ;

        System.out.println(prefix(array));  // ab

        String[] array2 = {"abc", "abcd", "abce", "abcac"} ;

        System.out.println(prefix(array2)); // abc

    }
}

