package prog_boletin_11_4;

import java.util.Scanner;

public class PROG_boletin_11_4 {

    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Teclea número");
        int num = scaner.nextInt();

        while (num != 0) {
            System.out.println("Tabla de multiplicar:");
            for (int i = 0; i < 11; i++) {
                System.out.println(num + " x " + i + " = " + num * i);
            }
            System.out.println("Teclea número");
            num = scaner.nextInt();
        }
    }
}
