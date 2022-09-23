package Service;

import Model.Carro;

public class CarroServiceImpl implements CarroService {

    @Override
    public void acelerar(Carro carro) {
       double cavalos = (carro.getCavalos() * (0.10));
       carro.setVelocidadeAtual((int) ((carro.getVelocidadeAtual()) + cavalos));
    }


    @Override
    public void frear(Carro carro) {
        double cavalos = (carro.getCavalos() * (0.15));
        carro.setVelocidadeAtual((int) ((carro.getVelocidadeAtual()) + cavalos));
    }

            @Override
            public void ligar (Carro carro){
                carro.setLigado(true);
            }

            @Override
            public void desligar (Carro carro){
                carro.setLigado(false);
            }

            @Override
            public String estadoAtual (Carro carro){
                return carro.toString();

            }

    }
