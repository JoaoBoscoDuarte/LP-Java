package atv.figurasGeometricas.src;

import atv.figurasGeometricas.src.FiguraGeometrica2D;

public class TrianguloRegular implements FiguraGeometrica2D {
    private double lado;

    public TrianguloRegular(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return getLado() * getLado() * Math.sqrt(3)/4;
    }

    public double getPerimetro() {
        return 3 * getLado();
    }

    public String getTipoFigura() {
        return "Triângulo regular";
    }

    public int compareTo(FiguraGeometrica2D o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
