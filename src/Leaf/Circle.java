package Leaf;

import Visitor.VillageVisitor;

public class Circle extends Shape {
    public Circle(String material) { super("Leaf.Circle", material); }

    @Override
    public void accept(VillageVisitor visitor) {
        visitor.visit(this);
    }
}
