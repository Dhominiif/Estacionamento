import java.util.ArrayList;

public class estacionamento {

    ArrayList<carro> carros_estacionados = new ArrayList<carro>();
    protected int contar = 0;

    public void estacionar(carro carro){

        if(contar  <= 6){

            this.carros_estacionados.add(carro);
            System.out.println("\nCarro com a placa |"+carro.getPLACA()+"| estacionado na vaga "+(contar+1)+"\n");
            contar++;

        }else{

            System.out.println("\nSEM VAGA, CARRO COM A PLACA |"+carro.getPLACA()+"| RETORNE MAIS TARDE! :(\n");
        }
    }
    public void retirar(carro carro){

        System.out.println("\nCarro com a placa |"+carro.getPLACA()+"| retirado da vaga "+(contar+1)+". Até mais! ;)\n");
        this.carros_estacionados.remove(carro);
        contar--;
    }

    public void info_estacionados(){

        for(int i = 0; i < carros_estacionados.size(); i++){

            System.out.println("\nVAGA DE NUMERO: "+(i+1));
            carros_estacionados.get(i).info_car();
        }
    }
}
