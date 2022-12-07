package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void info() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error2 = new Error(true, 2, "Ошибка номер два. Синтаксис");
        Error error3 = new Error(false, 0, "Ошибка ноль. Нет ошибки");
        error.info();
        error2.info();
        error3.info();
    }
}
