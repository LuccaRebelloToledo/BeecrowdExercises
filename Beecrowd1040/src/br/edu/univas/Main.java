/*Read four numbers (N1, N2, N3, N4), which one with 1 digit after the decimal point, corresponding to 4 scores obtained by a student. Calculate the average with weights 2, 3, 4 e 1 respectively, for these 4 scores and print the message "Media: " (Average), followed by the calculated result. If the average was 7.0 or more, print the message "Aluno aprovado." (Approved Student). If the average was less than 5.0, print the message: "Aluno reprovado." (Reproved Student). If the average was between 5.0 and 6.9, including these, the program must print the message "Aluno em exame." (In exam student).

In case of exam, read one more score. Print the message "Nota do exame: " (Exam score) followed by the typed score. Recalculate the average (sum the exam score with the previous calculated average and divide by 2) and print the message “Aluno aprovado.” (Approved student) in case of average 5.0 or more) or "Aluno reprovado." (Reproved student) in case of average 4.9 or less. For these 2 cases (approved or reproved after the exam) print the message "Media final: " (Final average) followed by the final average for this student in the last line.

Input
The input contains four floating point numbers that represent the students' grades.

Output
Print all the answers with one digit after the decimal point.*/

package br.edu.univas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {        // Exercicio 1040
        Scanner scanner = new Scanner(System.in);
        float notaA = scanner.nextFloat();
        float notaB = scanner.nextFloat();
        float notaC = scanner.nextFloat();
        float notaD = scanner.nextFloat();

        double media = ((notaA * 2) + (notaB * 3) + (notaC * 4) + (notaD)) / 10;

        if (media >= 7) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno aprovado.");
        } else if (media >= 5 && media < 6.9) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno em exame.");
            float notaExame = scanner.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", notaExame);
            media = (media + notaExame) / 2;
            if (media >= 5) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", media);
            } else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f%n", media);
            }
        } else {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno reprovado.");
        }
    }
}
