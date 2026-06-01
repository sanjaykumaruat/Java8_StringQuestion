package com.words;

public class Day6_RemoveCharacterFromWords {
    public static void main(String[] args) {
        String[] words = {"abc", "abcc", "cba"};

        removeCharacter(words, 'a');
    }

    static void removeCharacter(String[] words, char ch) {
        System.out.println("Words after removing '" + ch + "':");
        for (String word : words) {
            String newWord = word.replace(String.valueOf(ch), "");
            System.out.println(newWord);
        }
    }
}

//public class RemoveCharacter {
//    public static void main(String[] args) {
//        String[] words = {"abc", "abcc", "cba"};
//
//        for (String word : words) {
//            System.out.println(word.replace("a", ""));
//        }
//    }
//}
