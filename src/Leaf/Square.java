package Leaf;

import Visitor.VillageVisitor;

public class Square extends Shape {
    public Square(String material) { super("Leaf.Square", material); }

    @Override
    public void accept(VillageVisitor visitor) {
        visitor.visit(this);
    }

}
