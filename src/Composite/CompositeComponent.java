package Composite;

import java.util.ArrayList;
import java.util.List;

abstract class CompositeComponent implements VillageComponent {
    protected String name;
    protected List<VillageComponent> components = new ArrayList<>();

    public CompositeComponent(String name) {
        this.name = name;
    }

    public CompositeComponent() {

    }

    public void add(VillageComponent component) {
        components.add(component);
    }

    public List<VillageComponent> getComponents() {
        return components;
    }

    @Override
    public String getName() {
        return name;
    }
}
