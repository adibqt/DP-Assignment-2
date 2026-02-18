package Composite;

import Visitor.VillageVisitor;

public class WaterSource extends CompositeComponent {
    public WaterSource(String name) { super(name); }

    @Override
    public void accept(VillageVisitor visitor) {
        visitor.visit(this);
        for(VillageComponent c : components) c.accept(visitor);
    }
}
