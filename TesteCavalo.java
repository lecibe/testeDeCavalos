package Service;

import Model.Carro;
import builder.CarroBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TesteCavalo {

    @Before
    public void setup(){
        CarroBuilder.retornarCarro();
        System.out.println("Before");
    }

    @After
    public void tearDown(){
        System.out.println("After");
    }

    @Test

    public void testeCavalos(){

        //given
        CarroService carroService = new CarroServiceImpl();

        Carro carro1 =
                CarroBuilder.retornarCarro().getCarro();

        //when
        carroService.ligar(carro1);
        carroService.acelerar(carro1);
        carroService.frear(carro1);

        System.out.println(carro1);


    }
}
