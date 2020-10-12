package br.edu.revisaoExercicio5;

import javax.swing.plaf.IconUIResource;

public class Cartela {

    private int[][] num = new int[6][4];

    public int[][] getNum() {
        return num;
    }

    public void setNum(int[][] num) {
        this.num = num;
    }

    public int numCartela(int i, int j, int nums) {
         num[i][j] = nums;
        return num[i][j];
    }

    public void imprimir() {
        System.out.println("SUA CARTELA");
        System.out.println("------------");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(num[i][j] + "|");
            }

            System.out.println();
        }
    }


    public Boolean temNaCartela(int nums) {
           boolean repete = false;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (num[i][j] == nums) {
                  repete = true;
                }
                }
            }
        return repete;
    }

}