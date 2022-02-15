public class carro {
    
    private String cor, placa; private double velo_max;

    public carro(String cor, String placa, double velo_max){

        this.cor = cor;
        this.placa = placa;
        this.velo_max = velo_max;
    }

    public void setCOR(String cor){
        this.cor = cor;
    }
    public String getCOR(){
        return this.cor;
    }

    public void setPLACA(String placa){
        this.placa = placa;
    }
    public String getPLACA(){
        return this.placa;
    }

    public void setVELO_MAX(double velo_max){
        this.velo_max = velo_max;
    }
    public double getVELO_MAX(){
        return this.velo_max;
    }

    public void info_car(){

        System.out.printf("COR: "+this.cor);
        System.out.printf("\nPLACA: "+this.placa);
        System.out.printf("\nvelocidade maxima: "+this.velo_max+"\n\n");
    }
}
