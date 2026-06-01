package com.string;

//File: PalindromeCheck.java
public class D5d_PalindromeCheck {
 public static void main(String[] args) {
     String str = "madam";
     String reversed = new StringBuilder(str).reverse().toString();

     if (str.equalsIgnoreCase(reversed)) {
         System.out.println(str + " is a palindrome.");
     } else {
         System.out.println(str + " is not a palindrome.");
     }
 }
}
