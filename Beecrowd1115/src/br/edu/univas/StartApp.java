/*Write a program to read the coordinates (X, Y) of an indeterminate number of points in Cartesian system. For each point write the quadrant to which it belongs. The program finish when at least one of two coordinates is NULL (in this situation without writing any message).

Input
The input contains several tests cases. Each test case contains two integer numbers.

Output
For each test case, print the corresponding quadrant which these coordinates belong, as in the example.*/
package br.edu.univas;

import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        while(x != 0 && y != 0) {
            if(x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if(x > 0 && y < 0) {
                System.out.println("quarto");
            } else if(x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if(x < 0 && y > 0) {
                System.out.println("segundo");
            }
            x = scanner.nextDouble();
            y = scanner.nextDouble();
        }
    }
}
