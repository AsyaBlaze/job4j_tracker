package ru.job4j.early;
//
public class PasswordValidator {

    public static String validate(String password) {
        char[] array = password.toCharArray();
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean number = false;
        boolean specChar = false;
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if  (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        for (char x : array) {
            if (Character.isUpperCase(x)) {
                upperCase = true;
            }
            if (Character.isLowerCase(x)) {
                lowerCase = true;
            }
            if (Character.isDigit(x)) {
                number = true;
            }
            if (!Character.isLetter(x) && !Character.isDigit(x)) {
                specChar = true;
            }
        }
        if (password.toLowerCase().contains("user")
                || password.toLowerCase().contains("password")
                || password.toLowerCase().contains("admin")
                || password.toLowerCase().contains("qwerty")
                || password.contains("12345")) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        if (!upperCase) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!lowerCase) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!number) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!specChar) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        return password;
    }
}

