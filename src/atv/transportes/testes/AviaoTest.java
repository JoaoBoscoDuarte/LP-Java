package atv.transportes.testes;

import atv.transportes.src.Aviao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AviaoTest {

    @Test
    public void teste(){
        Aviao aviao = new Aviao(false, "Pista bloqueada", 0, 100, 10);

        try{
            aviao.andar();
            fail();
        } catch (Exception e){
            System.out.println(e.getMessage());
            if(!e.getMessage().equals("O trem de pouso precisa estar ativado para que o avião possa andar"))
                fail();
        }

        System.out.println("**Ativando trem de pouso para decolagem");
        aviao.setTremDePouso(true);

        try{
            aviao.andar();
            fail();
        } catch(Exception e){
            System.out.println(e.getMessage());
            if(!e.getMessage().equals("O avião não tem gasolina suficiente para andar"))
                fail();
        }

        System.out.println("**Abastecendo aeronave");
        aviao.setGasolinaLitros(80);

        try{
            aviao.andar();
            fail();
        } catch(Exception e){
            System.out.println(e.getMessage());
            if(!e.getMessage().equals("A torre não deu permissão para que o avião possa andar"))
                fail();
        }

        System.out.println("**Aguardando sinal da torre");
        aviao.setSinalTorre("Ok");

        try{
            aviao.andar();
        } catch(Exception e){
            System.out.println(e.getMessage());
            fail();
        }

        System.out.println("**Decolagem feita com sucesso");
    }

}