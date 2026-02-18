package Leaf;

import Visitor.VillageVisitor;

public class Triangle extends Shape {
    public Triangle(String material) { super("Leaf.Triangle", material); }

    @Override
    public void accept(VillageVisitor visitor) {
        visitor.visit(this);
    }
}
