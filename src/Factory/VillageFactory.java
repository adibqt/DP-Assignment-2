package Factory;

import Composite.House;
import Composite.Tree;
import Composite.WaterSource;

public interface VillageFactory {
    House createHouse();
    Tree createTree();
    WaterSource createWaterSource();
}
