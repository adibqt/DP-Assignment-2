package Visitor;

import Composite.House;
import Composite.Tree;
import Composite.Village;
import Composite.WaterSource;
import Leaf.Circle;
import Leaf.Square;
import Leaf.Triangle;

public class CostCalculatorVisitor implements VillageVisitor {
    private double totalCost = 0;

    public double getTotalCost() { return totalCost; }

    @Override
    public void visit(Village village) {
        System.out.println("Calculating cost for Village: " + village.getName());
    }

    @Override
    public void visit(House house) {
        // Base cost for the structure blueprint
        totalCost += 100;
    }

    @Override
    public void visit(Tree tree) {
        totalCost += 20;
    }

    @Override
    public void visit(WaterSource waterSource) {
        totalCost += 50;
    }

    // Costs based on materials of the shapes
    @Override
    public void visit(Square square) {
        totalCost += getMaterialCost(square.getMaterial()) * 10; // Area calc logic simplified
    }

    @Override
    public void visit(Triangle triangle) {
        totalCost += getMaterialCost(triangle.getMaterial()) * 5;
    }

    @Override
    public void visit(Circle circle) {
        totalCost += getMaterialCost(circle.getMaterial()) * 8;
    }

    private double getMaterialCost(String material) {
        switch (material.toLowerCase()) {
            case "brick": return 50;
            case "mud": return 10;
            case "water": return 5;
            case "leaf": return 2;
            case "mango": return 15; // Fruit value
            default: return 1;
        }
    }
}
