package br.edu.revisaoExercicio3;

public class Porta {

    private Boolean aberta;
    private String cor;
    private Double dimensaoX;
    private Double dimensaoY;
    private Double dimensaoZ;

    public Boolean getAberta() {
        return aberta;
    }

    public void setAberta(Boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(Double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public Double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(Double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public Double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(Double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public void abre(){

        this.aberta = true;
    }

    public void fecha(){

        this.aberta = false;
    }

    public void pinta(String s){

        this.cor = s;
    }

    public Boolean estaAberta(){
        if (aberta.equals(true)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Porta{" +
                "aberta=" + aberta +
                ", cor='" + cor + '\'' +
                ", dimensaoX=" + dimensaoX +
                ", dimensaoY=" + dimensaoY +
                ", dimensaoZ=" + dimensaoZ +
                '}';
    }
}
