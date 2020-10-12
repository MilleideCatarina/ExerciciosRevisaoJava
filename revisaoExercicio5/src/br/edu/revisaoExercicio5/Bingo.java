package br.edu.revisaoExercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bingo {

    Cartela cartela = new Cartela();
    public List<Integer> pedras = new ArrayList<>();


    public static void main(String[] args) {


        Bingo bingo = new Bingo();

        bingo.geraCartela();
        bingo.sorteio();
    }

    //Random fera números aleatórios, porém repetidos. Por isso, tive que criar funcões que verificam
    //se o nº se repete - tanto cartela como sorteio

    public void geraCartela() {
        Random rd = new Random();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                int n = rd.nextInt(75) + 1;

                if (cartela.temNaCartela(n) == false) {

                    cartela.numCartela(i, j, n);
                } else {
                    j--;

                }
            }
        }
        cartela.imprimir();

    }

    public void sorteio() {
        System.out.println();

        System.out.println("Começou o sorteio!");
        System.out.println();

        Random rd = new Random();
        int n = 1;
        int p = 0;
        int rodada =0;

        for (int i = 0; i < n; i++) {
            int s = rd.nextInt(75) + 1;

            boolean repete = confereSorteio(rodada, s);

            if (repete == false) {
                System.out.println( (rodada+1)+ "ª rodada - pedra nº: "+s);
                rodada++;
                boolean c = cartela.temNaCartela(s);
               if(c== true){
                   System.out.println("Tem na cartela :)");
                   p++;
               }
            }
            if (p == 24) {
                n = 0;
                System.out.println();
                System.out.println("      BINGO!!");
                System.out.println("Foram realizadas "+rodada+" rodadas até sair o vencedor!");
                System.out.println("As pedras cantadas foram: " +pedras);
            } else {
                n++;
            }


        }

    }


    public boolean confereSorteio(int n, int s) {

        boolean repete = true;

        for (int j = 0; j <=n; j++) {
           if (!pedras.contains(s)) {
                pedras.add(s);
                repete = false;
           }

        }
        return repete;
    }
}


