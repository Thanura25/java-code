public abstract class Beverages {
    private boolean wantsExtras;

    public abstract void brew();
    public abstract void addCondiments();
    public abstract void addExtras();

    public void boilWater() {
        System.out.println("Boiling Water");
    }
    public void pourInCup() {
        System.out.println("Pouring In Cup");
    }
    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }
    public final void finalTemplateMethod() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras) {
            addExtras();
        }
    }
}
