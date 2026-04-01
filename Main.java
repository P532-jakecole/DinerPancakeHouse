public class Main {
    public static void main(String[] args) {

        ObjectvilleDiner diner = new ObjectvilleDiner();
        ObjectvillePancakeHouse pancakeHouse = new ObjectvillePancakeHouse();

        System.out.println("--- DINER MENU ---");
        for (MenuItem item : diner.getMenuItems()) {
            if (item != null) {
                printItem(item);
            }
        }

        System.out.println("\n--- PANCAKE HOUSE MENU ---");
        for (MenuItem item : pancakeHouse.getMenuItems()) {
            printItem(item);
        }
    }

    public static void printItem(MenuItem item) {
        System.out.println(item.getName() + ", $" + item.getPrice() +
                " -- " + item.getDescription() +
                " (Veg: " + item.isVegetarian() + ")");
    }
}
