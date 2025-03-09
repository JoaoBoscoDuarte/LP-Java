package outros.areaTriângulo;

public class Triangle {
    public double a;
    public double b;
    public double c;

    //Metodo para calcular a área de um triângulo
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
