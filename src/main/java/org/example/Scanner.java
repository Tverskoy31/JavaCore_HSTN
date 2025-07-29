package org.example;


public class Scanner {
    public static void main(String[] args) {
        System.out.println("Введи строку");
        String s = new java.util.Scanner(System.in).nextLine();
        System.out.println("Вот то что ты ввел " + s);

        System.out.println("Введи снова строку и я выведу один символ");
        char ch = new java.util.Scanner(System.in).nextLine().charAt(10);
        System.out.println("Один символ " + ch);
    }
}
