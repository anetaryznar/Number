package pl.sdacademy.java7krk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj liczbe");
        int liczba = scanner.nextInt();

        for (int i = 0; i < liczba; i++) {
            for (int j = 0; j < liczba; j++) {
                if (i >= j) {
                    System.out.print("#");
                }
            }

            System.out.println();
        }


        for (int i = 0; i < liczba; i++) {
            for (int j = 0; j < liczba - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
