package atv.transportes.src;

public class Bicicleta implements Veiculo{

    private boolean descanso = true;

    public void colocarDescanso(){
        this.descanso = true;
    }

    public void tirarDescanso(){
        this.descanso = false;
    }

    public boolean isDescanso() {
        return descanso;
    }

    @Override
    public void andar() throws Exception {

        if(descanso)
            throw new Exception("Tire o descanso para poder andar de bicicleta!");
    }

    @Override
    public String toString() {
        return "Bicicleta: " + "/n" +
                "descanso=" + descanso + "/n";
    }
}
