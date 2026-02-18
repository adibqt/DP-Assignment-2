package Factory;

import Composite.House;
import Composite.Tree;
import Composite.WaterSource;
import Leaf.Circle;
import Leaf.Square;
import Leaf.Triangle;

public class RuralFactory implements VillageFactory {
    @Override
    public House createHouse() {
        House h = new House("Mud House");
        h.add(new Square("Mud")); // Wall
        h.add(new Triangle("Straw")); // Roof
        return h;
    }

    @Override
    public Tree createTree() {
        Tree t = new Tree("Banana Tree");
        t.add(new Square("Green Stem"));
        t.add(new Triangle("Leaf"));
        return t;
    }

    @Override
    public WaterSource createWaterSource() {
        WaterSource w = new WaterSource("Pond");
        w.add(new Circle("Water"));
        return w;
    }
}
