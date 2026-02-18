package Visitor;
import Composite.House;
import Composite.Tree;
import Composite.Village;
import Composite.WaterSource;
import Leaf.Circle;
import Leaf.Square;
import Leaf.Triangle;

public class ReportVisitor implements VillageVisitor {
    @Override
    public void visit(Village village) {
        System.out.println("--- Village Report: " + village.getName() + " ---");
    }

    @Override
    public void visit(House house) {
        System.out.println("Structure: " + house.getName());
    }

    @Override
    public void visit(Tree tree) {
        System.out.println("Nature: " + tree.getName());
    }

    @Override
    public void visit(WaterSource waterSource) {
        System.out.println("Water: " + waterSource.getName());
    }

    @Override
    public void visit(Square square) {
        System.out.println("  - Component: Square (" + square.getMaterial() + ")");
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("  - Component: Triangle (" + triangle.getMaterial() + ")");
    }

    @Override
    public void visit(Circle circle) {
        System.out.println("  - Component: Circle (" + circle.getMaterial() + ")");
    }
}
