package com.string;


class D7_Remove_Spaces {
    public static void main(String[] args) {
        String s = "sanjay kumar"; // Input string
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') { // Check if the character is not a space
                sb.append(s.charAt(i));
            }
        }

        System.out.println("String after removing spaces: " + sb.toString());
    }
}

// Second ways
//class RemoveSpaces {
//    public static void main(String[] args) {
//        String s = "sanjay kumar"; // Input string
//        s = s.replaceAll("\\s", ""); // Remove all spaces
//
//        System.out.println("String after removing spaces: " + s);
//    }
//}
