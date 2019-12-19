package com.company.Deneme;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Greetings inEnglish = new English();
        Greetings inturkish = new Turkish();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a language to see greetings patterns in:\n " +
                "Type [1] for english or [2] for turksih");
        String answer = scanner.nextLine();
        if (answer.equals("1")){
            inEnglish.template();
        }
        if (answer.equals("2")){
            inturkish.template();
        }
    }

}
