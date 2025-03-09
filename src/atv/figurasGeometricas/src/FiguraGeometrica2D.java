package atv.figurasGeometricas.src;

public interface FiguraGeometrica2D extends Comparable<FiguraGeometrica2D> {
    public double getPerimetro();
    public double getArea();
    public String getTipoFigura();
}
