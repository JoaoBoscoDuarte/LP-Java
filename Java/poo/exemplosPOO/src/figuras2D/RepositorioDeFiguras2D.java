package figuras2D;

import java.util.List;
import java.util.ArrayList;

public class RepositorioDeFiguras2D {
    private List<FiguraGeometrica2D> figuras;

    public RepositorioDeFiguras2D() {
        figuras = new ArrayList<>();
    }

    public void addFigura(FiguraGeometrica2D figura) {
        figuras.add(figura);
    }

    // Verifica se a fugura existe para ser usad em rmvFigura
    public boolean existeFigura(int indice) {
        return figuras.contains(figuras.get(indice));
    }

    public void rmvFigura(int indice) {
        if (existeFigura(indice)) {
            figuras.remove(indice);

        }
    }

    public double recuperarArea(int indice) {
        return figuras.get(indice).getArea();
    }

    public double recuperarPerimetro(int indice) {
        return figuras.get(indice).getPerimetro();
    }

    public String recuperarTipo(int indice) {
        return figuras.get(indice).getTipoFigura();
    }

    public void listarFiguras() {
        System.out.println(figuras.toString());
    }

    @Override
    public String toString() {
        return "RepositorioDeFiguras2D{" +
                "figuras=" + figuras +
                '}';
    }
}
