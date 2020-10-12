package br.edu.revisaoExercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Pessoa pessoa = new Pessoa();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome");
        pessoa.setNome(sc.nextLine());
        System.out.println("Digite a idade");
        pessoa.setIdade(Integer.parseInt(sc.nextLine()));

        System.out.println(pessoa.toString());

        pessoa.fazAniversario();


        System.out.println("Após fazer aniversário " + pessoa.toString());
    }
}
