package Factory;
import java.util.ArrayList;
import java.util.List;
import Composite.House;
import Composite.Tree;
import Composite.WaterSource;
import Leaf.Circle;
import Leaf.Square;
import Leaf.Triangle;

public class UrbanFactory implements VillageFactory{
    @Override
    public House createHouse() {
        House h = new House("Brick House");
        h.add(new Square("Brick")); // Wall
        h.add(new Square("Brick")); // Wall
        h.add(new Triangle("Tile")); // Roof
        return h;
    }

    @Override
    public Tree createTree() {
        Tree t = new Tree("Mango Tree");
        t.add(new Square("Wood")); // Trunk
        t.add(new Circle("Mango")); // Foliage
        return t;
    }

    @Override
    public WaterSource createWaterSource() {
        WaterSource w = new WaterSource("Swimming Pool");
        w.add(new Square("Concrete")); // Tiles
        w.add(new Square("Water")); // Water body
        return w;
    }
}
