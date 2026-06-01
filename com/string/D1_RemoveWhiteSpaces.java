package com.string;
public class D1_RemoveWhiteSpaces {

    public static String removeSpaces(String str) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') { // skip white spaces
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "  Java   Programming   Language  ";
        String output = removeSpaces(input);
        System.out.println("Original String: \"" + input + "\"");
        System.out.println("After removing spaces: \"" + output + "\"");
    }
}
