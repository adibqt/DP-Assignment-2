import Composite.Village;
import Composite.VillageComponent;
import Factory.UrbanFactory;
import Factory.VillageFactory;
import Visitor.CostCalculatorVisitor;
import Visitor.ReportVisitor;

public class AgeOfVillagers {
    public static void main(String[] args) {
        // 1. User chooses a package (Abstract Factory)
        // Let's say user chose 'Urban'
        VillageFactory factory = new UrbanFactory();
        // VillageFactory factory = new RuralFactory(); // Can be swapped easily

        // 2. Build the Village (Composite Structure)
        Village myVillage = new Village("My Dream Village");

        // Add components using the factory
        myVillage.add((VillageComponent) factory.createHouse());
        myVillage.add(factory.createTree());
        myVillage.add(factory.createWaterSource());

        // Add a second tree just for fun
        myVillage.add(factory.createTree());

        // 3. Perform Operations (Visitor Pattern)

        // Operation A: Generate Report
        ReportVisitor reporter = new ReportVisitor();
        myVillage.accept(reporter);

        System.out.println("\n---------------------------\n");

        // Operation B: Calculate Cost
        CostCalculatorVisitor calculator = new CostCalculatorVisitor();
        myVillage.accept(calculator);
        System.out.println("Total Estimated Cost: " + calculator.getTotalCost() + " Gold");
    }
}