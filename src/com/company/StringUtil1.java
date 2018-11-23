package com.company;

public class StringUtil1 {

    public static void main(String[] args) {

        String inputText = "newworld";
        String s = subString(inputText, 1, 6);
        System.out.println(s);

//        String substring = inputText.substring(0, 0);
//        System.out.println(substring);

    }

    public static String subString(String text, int start, int end) {

        char[] array = new char[end - start + 1];
        int j = 0;

        boolean isValid = isValidIndexes(text, start, end);
        boolean isFullString = isFullString(text, start, end);

        if (isValid) {
            if (isFullString) {
                return text;
            }
            for (int i = start; i <= end; i++) {
                array[j++] = text.charAt(i);
            }
        } else {
            return "Invalid";
        }

        return new String(array);

    }

    private static boolean isValidIndexes(String text, int start, int end) {
        return start >= 0 && start <= end && end < text.length();
    }

    private static boolean isFullString(String text, int start, int end) {

        return start == 0 && end == text.length() - 1;
    }
}
