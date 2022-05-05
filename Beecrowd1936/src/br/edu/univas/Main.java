/*The factor of a positive integer N, denoted by N!, is defined as the product of the positive integers smaller than or equal to N. For example 4! = 4 × 3 × 2 × 1 = 24.

Given a positive integer N, you should write a program to determine the smallest number k such that N = a1! + A2! + ... + Ak!, where each ai, for 1 ≤ i ≤ k is a positive integer.

For example, for N = 10 the answer is 3, it is possible to write N as the sum of three numbers factor: 10 = 3! + 2! + 2!. For N = 25 the answer is 2, it is possible to write N as the sum of two factorial numbers: 25 = 4! + 1!.

Input
The input consists of a single line containing an integer N (1 ≤ N ≤ 105).

Output
Its program should produce a single line with an integer representing the smallest amount of factor numbers whose sum is equal to the value of N.*/

package br.edu.univas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] factory = new int[9];
        factory[0] = 1;
        for (int i = 1; i <= 8; i++){
            factory[i] = i * factory[i-1];
        }
        int number = scanner.nextInt();
        int x = 0;
        for(int i = 8; i >= 0; i--){
            x += (number/factory[i]);
            number = number % factory[i];
        }
        System.out.println(x);
    }
}



