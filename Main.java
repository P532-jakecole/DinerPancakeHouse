public class Main {
    public static void main(String[] args) {

        ObjectvilleDiner diner = new ObjectvilleDiner();
        ObjectvillePancakeHouse pancakeHouse = new ObjectvillePancakeHouse();

        System.out.println("--- Combined MENU ---");
        for (MenuItem item : pancakeHouse.getMenuItems()) {
            printItem(item);
        }
        for (MenuItem item : diner.getMenuItems()) {
            if (item != null) {
                printItem(item);
            }
        }
    }

    public static void printItem(MenuItem item) {
        System.out.println(item.getName() + ", $" + item.getPrice() +
                " -- " + item.getDescription() +
                " (Veg: " + item.isVegetarian() + ")");
    }
}
