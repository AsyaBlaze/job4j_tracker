package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) {
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
        char[] array = password.toCharArray();
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
            if (upperCase && lowerCase && number && specChar) {
                break;
            }
        }
        String[] notUnicalPass = {"user", "password", "admin", "qwerty", "12345"};
        for (int i = 0; i < notUnicalPass.length; i++) {
            if (password.toLowerCase().contains(notUnicalPass[i])) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
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

