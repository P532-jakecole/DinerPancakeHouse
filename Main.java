public class Main {
    public static void main(String[] args) {

        ObjectvilleDiner diner = new ObjectvilleDiner();
        ObjectvillePancakeHouse pancakeHouse = new ObjectvillePancakeHouse();
        ObjectvilleCafe cafe = new ObjectvilleCafe();
        int length = pancakeHouse.getMenuItems().size() + diner.getMenuItems().length + cafe.getMenuItems().size();
        MenuItem[] combinedMenu = new MenuItem[length];
        DinerMenuIterator menu = new DinerMenuIterator(combinedMenu);
        int index = 0;
        
        for (MenuItem item : pancakeHouse.getMenuItems()) {
            combinedMenu[index] = item;
            index++;
        }
        for (MenuItem item : diner.getMenuItems()) {
            if (item != null) {
                combinedMenu[index] = item;
                index++;
            }
        }
        for (MenuItem item : cafe.getMenuItems().values()) {
            if (item != null) {
                combinedMenu[index] = item;
                index++;
            }
        }

        System.out.println("--- Combined MENU ---");
        while(menu.hasNext()){
            MenuItem item = (MenuItem) menu.next();
            printItem(item);
        }

        System.out.println("___ ALternate Diner Menu_____");
        AlternativeDinerMenuIterator altDiner = new AlternativeDinerMenuIterator(diner.getMenuItems(), "Tuesday");
        while(altDiner.hasNext()){
            MenuItem item = (MenuItem) altDiner.next();
            printItem(item);
        }
    }

    public static void printItem(MenuItem item) {
        System.out.println(item.getName() + ", $" + item.getPrice() +
                " -- " + item.getDescription() +
                " (Veg: " + item.isVegetarian() + ")");
    }
}
