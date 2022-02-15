
//1- criar uma classe Carro que contem cor, placa, e velocidade maxima
//2-criar uma classe estacionamento que possua varios carros
//3-criar 7 carros
//4-coloca-los no estacionamento
//5-imprimir uma lista com todos os carros estacionados contendo(cor, placa e velocidade maxima)

// - Tarefinha de casa
// Estacionamento limitado a 7 carros
// Retirar carros do estacionamento

public class Principal {

    public static void main(String[] args){
        
        carro n1 = new carro("preto", "1", 250);
        carro n2 = new carro("vermelho", "2", 350);
        carro n3 = new carro("rosa", "3", 350);
        carro n4 = new carro("prata", "4", 150);
        carro n5 = new carro("Cinza", "5", 250);
        carro n6 = new carro("verde", "6", 550);
        carro n7 = new carro("marrom", "7", 450);
        carro n8 = new carro("roxo", "8", 250);

        estacionamento copa_azul = new estacionamento();

        copa_azul.estacionar(n1);
        copa_azul.estacionar(n2);
        copa_azul.estacionar(n3);
        copa_azul.estacionar(n4);
        copa_azul.estacionar(n5);
        copa_azul.estacionar(n6);
        copa_azul.estacionar(n7);
        copa_azul.estacionar(n8);

        copa_azul.info_estacionados();

        copa_azul.retirar(n7);
        copa_azul.estacionar(n8);
        
        copa_azul.info_estacionados();
    }
}