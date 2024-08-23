import java.util.Scanner;
public class BeverageTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want extras with your Tea (yes/no)");
        boolean teaExtras = scanner.nextLine().trim().equalsIgnoreCase("yes");

        System.out.print("Do you want extras with your Coffee (yes/no)");
        boolean coffeeExtras = scanner.nextLine().trim().equalsIgnoreCase("yes");

        Beverages tea = new Tea();
        tea.setWantsExtras(teaExtras);
        Beverages coffee = new Coffee();
        coffee.setWantsExtras(coffeeExtras);

        System.out.println("Making tea ...");
        tea.finalTemplateMethod();

        System.out.println("\nMarking coffee ...");
        coffee.finalTemplateMethod();

        scanner.close();
    }
}
