/*In this problem, your job is to read three Portuguese words. These words define an animal according to the table below, from left to right. After, print the chosen animal defined by these three words.
        Input
        The input contains 3 words, one by line, that will be used to identify the animal, according to the above table, with all letters in lowercase.

        Output
        Print the animal name according to the given input.*/


package br.edu.univas;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String A = scanner.next();
            String B = scanner.next();
            String C = scanner.next();

        if (A.equals("vertebrado") && B.equals("ave") && C.equals("carnivoro")) {
            System.out.println("aguia");
        } if (A.equals("vertebrado") && B.equals("ave") && C.equals("onivoro")) {
            System.out.println("pomba");
        } if (A.equals("vertebrado") && B.equals("mamifero") && C.equals("onivoro")){
            System.out.println("homem");
        } if (A.equals("vertebrado") && B.equals("mamifero") && C.equals("herbivoro")) {
            System.out.println("vaca");
        } if (A.equals("invertebrado") && B.equals("inseto") && C.equals("hematofago")) {
            System.out.println("pulga");
        } if (A.equals("invertebrado") && B.equals("inseto") && C.equals("herbivoro")) {
            System.out.println("lagarta");
        } if (A.equals("invertebrado") && B.equals("anelideo") && C.equals("hematofago")) {
            System.out.println("sanguessuga");
        } if (A.equals("invertebrado") && B.equals("anelideo") && C.equals("onivoro")) {
            System.out.println("minhoca");
        }
    }
}
