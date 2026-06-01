package com.string;


//File: ReverseWords.java
public class D4b_ReverseWords {
 public static void main(String[] args) {
     String sentence = "Java is fun";
     String[] words = sentence.split(" ");
     StringBuilder reversed = new StringBuilder();

     for (int i = words.length - 1; i >= 0; i--) {
         reversed.append(words[i]).append(" ");
     }

     System.out.println("Reversed sentence: " + reversed.toString().trim());
 }
}
