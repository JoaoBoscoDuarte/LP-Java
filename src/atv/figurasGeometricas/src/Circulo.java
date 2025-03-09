package atv.figurasGeometricas.src;

import atv.figurasGeometricas.src.FiguraGeometrica2D;

public class Circulo implements FiguraGeometrica2D {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return Math.PI * getRaio() * getRaio();
    }

    public double getPerimetro() {
        return 2 * Math.PI * getRaio();
    }

    public String getTipoFigura() {
        return "Círculo";
    }

    @Override
    public int compareTo(FiguraGeometrica2D o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
