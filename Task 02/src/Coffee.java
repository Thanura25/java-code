public class Coffee extends Beverages {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }
    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
    @Override
    public void addExtras() {
        System.out.println("Adding whipped Cream");
    }
}
