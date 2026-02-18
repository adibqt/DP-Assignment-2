package Composite;

import Visitor.VillageVisitor;

public class Village extends CompositeComponent {
    public Village(String name) { super(name); }

    @Override
    public void accept(VillageVisitor visitor) {
        visitor.visit(this);
        for(VillageComponent c : components) c.accept(visitor);
    }
}
