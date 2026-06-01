package com.string;

public class D6_RemoveCharactersFrom2String {
    public static void main(String[] args) {
        String str1 = "we belongs to russia";  // Input string 1
        String str2 = "wbos";                  // Input string 2 (characters to be removed)

        String result = removeCharacters(str1, str2);
        System.out.println("Resulting String: " + result);  // Output the resulting string
    }

    // Method to remove characters from str1 that are in str2
    public static String removeCharacters(String str1, String str2) {
        // Convert str2 into a set of characters for faster lookup
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (str2.indexOf(c) == -1) {  // Check if character is not in str2
                result.append(c);  // Append to result string
            }
        }
        
        return result.toString();  // Convert StringBuilder to String
    }
}

//Write a java program
//you have 2 string
//String str1 = "we belongs to russia"
//String str2= "wbos"
//remove str2 character from str1