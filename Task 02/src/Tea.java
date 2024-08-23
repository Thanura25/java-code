public class Tea extends Beverages {
    @Override
    public void brew() {
        System.out.println("Steeping the Tea");
    }
    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
    @Override
    public void addExtras() {
        System.out.println("Adding Honey");
    }
}
