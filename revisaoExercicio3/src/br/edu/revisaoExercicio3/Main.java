package br.edu.revisaoExercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Porta porta = new Porta();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a largura da porta");
        porta.setDimensaoX(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite o comprimento da porta");
        porta.setDimensaoY(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite a espessura da porta");
        porta.setDimensaoZ(Double.parseDouble(sc.nextLine()));

        System.out.println("Digite a cor da porta");
        porta.setCor(sc.nextLine());
        porta.pinta(porta.getCor());

        System.out.println("A porta está aberta (true) ou (false)?");
        porta.setAberta(Boolean.parseBoolean(sc.nextLine()));

        System.out.println("Você deseja abrir ou fechar a porta (pode digitar a ação)");
        String aberta = sc.nextLine();

        Boolean estado = porta.estaAberta();
        if (estado.equals(true) && aberta.equals("abrir")) {
            System.out.println("A porta já está aberta");
        } else if (estado.equals(true) && aberta.equals("fechar")) {
            porta.fecha();
        } else if (estado.equals(false) && aberta.equals("fechar")) {
            System.out.println("A porta já está fechada");

        } else if (estado.equals(false) && aberta.equals("abrir")) {
            porta.abre();

        } else {
            System.out.println("Não tem essa opção");
        }

        System.out.println(porta.toString());

    }
}
