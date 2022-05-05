/*A gas station wants to determine which of their products is the preference of their customers. Write a program to read the type of fuel supplied (coded as follows: 1. Alcohol 2. Gasoline 3. Diesel 4. End). If you enter an invalid code (outside the range of 1 to 4) a new code must be requested. The program will end when the inserted code is the number 4.

Input
The input contains only integer and positive values.

Output
It should be written the message: "MUITO OBRIGADO" and the amount of customers who fueled each fuel type, as an example.*/

package br.edu.univas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alcohol = 0, gasoline = 0, diesel = 0, choice = 0;
        while (choice != 4) {
            choice = scanner.nextInt();
            while (choice < 1 || choice > 4) {
                choice = scanner.nextInt();
            }
            switch (choice) {
                case 1: alcohol++;
                break;
                case 2: gasoline++;
                break;
                case 3: diesel++;
                break;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcohol);
        System.out.println("Gasolina: " + gasoline);
        System.out.println("Diesel: " + diesel);
    }
}