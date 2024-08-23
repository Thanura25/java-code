public class KitchenRoomLight implements Light{
    private int brightness;
    @Override
    public void on(){
        brightness = 100;
        System.out.println("Kitchen light is ON");
    }
    @Override
    public void off(){
        brightness = 0;
        System.out.println("Kitchen light is OFF");
    }
    @Override
    public void dim(int lrvel){
        brightness = lrvel;
        System.out.println("Kitchen light dimmed to" + lrvel + "%");
    }
    public int getBrightness() {
        return brightness;}
}
