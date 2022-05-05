/*Read an integer value X (1 <= X <= 1000).  Then print the odd numbers from 1 to X, each one in a line, including X if is the case.

        Input
        The input will be an integer value.

        Output
        Print all odd values between 1 and X, including X if is the case.*/

package br.edu.univas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i = i + 2) {
            System.out.println(i);
        }
    }
}
