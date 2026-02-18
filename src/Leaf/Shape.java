package Leaf;

import Composite.VillageComponent;

abstract class Shape implements VillageComponent {
    protected String type; // e.g., Leaf.Square, Leaf.Triangle
    protected String material; // e.g., Mud, Brick, Leaf

    public Shape(String type, String material) {
        this.type = type;
        this.material = material;
    }

    public String getMaterial() { return material; }

    @Override
    public String getName() { return material + " " + type; }
}
