public class Circle implements Shape{
    @Override
    public void drew() {
        int r= 5;
        int diameter = 2 * r + 1;
        System.out.println("Circle :");
        for (int i = 0; i < diameter; i++){
            for(int j = 0; j < diameter; j++){
                int x = i - r;
                int y = j - r;
                if (x * x + y *y <= r * r + r * 0.8){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
