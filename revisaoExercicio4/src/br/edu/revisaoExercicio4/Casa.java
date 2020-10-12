package br.edu.revisaoExercicio4;

public class Casa {

    private String cor;
    private Boolean porta1;
    private Boolean porta2;
    private Boolean porta3;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Boolean getPorta1() {
        return porta1;
    }

    public void setPorta1(Boolean porta1) {
        this.porta1 = porta1;
    }

    public Boolean getPorta2() {
        return porta2;
    }

    public void setPorta2(Boolean porta2) {
        this.porta2 = porta2;
    }

    public Boolean getPorta3() {
        return porta3;
    }

    public void setPorta3(Boolean porta3) {
        this.porta3 = porta3;
    }


    public int quantasPortasEstaoAbertas() {

        int cont = 0;

        if (porta1.equals(true)) {
            cont++;

        } if (porta2.equals(true)) {
            cont++;

        } if (porta3.equals(true)) {
            cont++;

        }
        return cont;
    }

    public void pinta(String s){
    this.cor = s;
        }

    @Override
    public String toString() {
        return "Casa{" +
                "cor='" + cor + '\'' +
                ", porta1=" + porta1 +
                ", porta2=" + porta2 +
                ", porta3=" + porta3 +
                '}';
    }
}
