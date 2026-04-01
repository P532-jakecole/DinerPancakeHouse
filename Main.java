public class Main {
    public static void main(String[] args) {

        ObjectvilleDiner diner = new ObjectvilleDiner();
        ObjectvillePancakeHouse pancakeHouse = new ObjectvillePancakeHouse();
        int length = pancakeHouse.getMenuItems().size() + diner.getMenuItems().length;
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

        System.out.println("--- Combined MENU ---");
        while(menu.hasNext()){
            MenuItem item = (MenuItem) menu.next();
            printItem(item);
        }
    }

    public static void printItem(MenuItem item) {
        System.out.println(item.getName() + ", $" + item.getPrice() +
                " -- " + item.getDescription() +
                " (Veg: " + item.isVegetarian() + ")");
    }
}
