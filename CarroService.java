package Service;

import Model.Carro;
import org.junit.After;
import org.junit.Before;

public interface CarroService {


    void acelerar(Carro carro);

    void frear(Carro carro);

    void ligar(Carro carro);
    void desligar (Carro carro);
    String estadoAtual(Carro carro);


}
