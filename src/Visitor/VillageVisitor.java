package Visitor;

import Composite.House;
import Composite.Tree;
import Composite.Village;
import Composite.WaterSource;
import Leaf.Circle;
import Leaf.Square;
import Leaf.Triangle;

public interface VillageVisitor {
    void visit(Village village);
    void visit(House house);
    void visit(Tree tree);
    void visit(WaterSource waterSource);
    void visit(Square square);
    void visit(Triangle triangle);
    void visit(Circle circle);
}
