package figurasGeometricas;

public class Circulo implements FiguraGeometrica2D{
    private double raio;
    private double area;
    private double perimetro;
    private String tipoFigura;

    public Circulo(double raio) {
        this.raio = raio;
        this.area = area();
        this.perimetro = perimetro();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double area() {
        return Math.PI * getRaio() * getRaio();
    }

    public double perimetro() {
        return 2 * Math.PI * getRaio();
    }

    public String getTipoFigura() {
        return "Círculo";
    }
}
