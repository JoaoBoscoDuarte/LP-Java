package figurasGeometricas;

public class Quadrado implements FiguraGeometrica2D {
    private double lado;
    private double area;
    private double perimetro;
    private String tipoFigura;

    public Quadrado(double lado) {
        this.lado = lado;
        this.area = area();
        this.perimetro = perimetro();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double setArea() {
        return getLado() * getLado();
    }

    public double getArea() {
        return area;
    }

    public double setPerimetro() {
        return 4 * getLado();
    }

    public double getPerimetro() {
        return perimetro;
    }

    public String getTipoFigura() {
        return "FigurasGemetricas2D.Quadrado";
    }
}
