package Composite;

import Visitor.VillageVisitor;

public class House extends CompositeComponent {
    public House(String name) { super(); }

    @Override
    public void accept(VillageVisitor visitor) {
        visitor.visit(this);
        // Delegate visit to children
        for(VillageComponent c : components) c.accept(visitor);
    }

}
