package application;

import entities.Student;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();

        System.out.print("Digite seu nome: ");
        stu.nome = sc.nextLine();
        System.out.print("Digite a nota do seu 1º trimestre: ");
        stu.nota01 = sc.nextFloat();
        stu.verificacao();
        System.out.print("Digite a nota do seu 2º trimestre: ");
        stu.nota02 = sc.nextFloat();
        stu.verificacao();
        System.out.print("Digite a nota do seu 3º trimestre: ");
        stu.nota03 = sc.nextFloat();

        stu.aprovado();
    }
}
