package lsp1.view;

import lsp1.shape.Quadrilaterial;
import lsp1.shape.Rectangle;

public class ShapeView {
    private final Quadrilaterial q;

    public ShapeView(Quadrilaterial q) {
        this.q = q;
    }

    public void showArea() {
        System.out.print("Площадь четырёхугольника равна:");
        System.out.println(q.getArea());
    }
}
