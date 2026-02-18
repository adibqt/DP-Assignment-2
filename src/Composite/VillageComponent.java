package Composite;

import Visitor.VillageVisitor;

public interface VillageComponent {
    void accept(VillageVisitor visitor);
    String getName();
}
