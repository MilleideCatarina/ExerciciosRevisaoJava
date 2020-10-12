package br.edu.revisaoExercicio4;

import java.util.Scanner;



public class Main {


    public static void main(String[] args) {
        // write your code here
        Casa casa = new Casa();

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a cor da casa?");
        casa.setCor(sc.nextLine());
        System.out.println("Digite true para abrir e false para fechar as portas:");
        System.out.println("porta 1");
        casa.setPorta1(Boolean.parseBoolean(sc.nextLine()));
        System.out.println("porta 2");
        casa.setPorta2(Boolean.parseBoolean(sc.nextLine()));
        System.out.println("porta 3");
        casa.setPorta3(Boolean.parseBoolean(sc.nextLine()));

        casa.pinta(casa.getCor());
        System.out.println();
        System.out.println(casa.toString());
        System.out.println();
        System.out.println(" Há " + casa.quantasPortasEstaoAbertas() + " porta(s) aberta(s)");

    }



}