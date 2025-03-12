package atv.transportes.testes;

import atv.transportes.src.Carro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CarroTest {

    Carro carro;
    final int CAPACIDADE_MAXIMA = 100;
    final int KM_POR_LITRO = 10;

   @BeforeEach
   void init(){
       carro = new Carro(0, CAPACIDADE_MAXIMA, KM_POR_LITRO);
   }

    @Test
    void abastecer(){

       try{
           this.carro.abastecer(10);
       } catch(Exception e){
           System.out.println(e.getMessage());
           fail();
       }

       assertEquals(10, carro.getGasolinaLitros());

    }

    @Test
    void andar(){

        try{
           carro.andar();
           fail();
        } catch(Exception e){
           System.out.println(e.getMessage());
           if(!e.getMessage().equals("Ligue o carro para andar"))
               fail();
        }

        System.out.println("**ligando o carro");
        carro.ligarCarro();


        try{
            carro.andar();
            fail();
        } catch(Exception e){
            System.out.println(e.getMessage());
            if(!e.getMessage().equals("Sem gasolina no tanque para andar"))
                fail();
        }

        System.out.println("**Abastecendo carro");
        try{
            carro.abastecer(100);
        } catch(Exception e){
            fail();
        }


        try{
            carro.andar();
            fail();
        } catch(Exception e){
            System.out.println(e.getMessage());
            if(!e.getMessage().equals("Abaixe o freio de mão para andar"))
                fail();
        }

        System.out.println("**Abaixando freio de mão");
        carro.abaixarFreioDeMao();

        try{
            carro.andar();
            fail();
        } catch(Exception e){
            System.out.println(e.getMessage());
            if(!e.getMessage().equals("Coloque o cinto para andar"))
                fail();
        }

        System.out.println("**Colocando cinto para andar");
        carro.colocarCintoMotorista();

        try{
            carro.andar();
        } catch(Exception e){
            System.out.println(e.getMessage());
            fail();
        }

        System.out.println("Carro andou 1km");

        assertEquals(CAPACIDADE_MAXIMA-KM_POR_LITRO, carro.getGasolinaLitros());

        System.out.println("Tanque carro: " + carro.getGasolinaLitros() + " litros");

    }

}
