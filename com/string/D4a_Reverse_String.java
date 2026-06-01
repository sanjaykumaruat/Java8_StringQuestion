package com.string;

//public class D4a_Reverse_String {
//	public static void main(String[] args) {
//		String str = "hello";
//		char[] chars = str.toCharArray();
//		int left = 0;
//		int right = str.length() - 1;
//
//		while (left < right) {
//			char temp = chars[left];
//			chars[left++] = chars[right];
//			chars[right--] = temp;
//		}
//
//		System.out.println("Reversed String: " + new String(chars)); // Output: "olleh"
//	}
//}
class D4a_Reverse_String {

    public static String reverseString(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            stringBuilder.append(s.charAt(i));
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }
}

