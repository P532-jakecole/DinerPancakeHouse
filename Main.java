import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // ObjectvilleDiner diner = new ObjectvilleDiner();
        // ObjectvillePancakeHouse pancakeHouse = new ObjectvillePancakeHouse();
        // ObjectvilleCafe cafe = new ObjectvilleCafe();
        // int length = pancakeHouse.getMenuItems().size() + diner.getMenuItems().length + cafe.getMenuItems().size();
        // MenuItem[] combinedMenu = new MenuItem[length];
        // DinerMenuIterator menu = new DinerMenuIterator(combinedMenu);
        // int index = 0;
        
        // for (MenuItem item : pancakeHouse.getMenuItems()) {
        //     combinedMenu[index] = item;
        //     index++;
        // }
        // for (MenuItem item : diner.getMenuItems()) {
        //     if (item != null) {
        //         combinedMenu[index] = item;
        //         index++;
        //     }
        // }
        // for (MenuItem item : cafe.getMenuItems().values()) {
        //     if (item != null) {
        //         combinedMenu[index] = item;
        //         index++;
        //     }
        // }

        MenuComponent DinerMenu = new Menu("Diner", "Diner Menu");
        DinerMenu.add(new MenuItem("Vegetarian BLT", "Fakin' Bacon with lettuce & tomato", true, 2.99));
        DinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato", false, 2.99));
        DinerMenu.add(new MenuItem("Soup of the day", "Soup with a side of potato salad", false, 3.29));

        // MenuComponent AlternateDinerMenu = new Menu("Alternate Diner", "Alternate Diner Menu");
        // AlternateDinerMenu.add(new MenuItem("Vegetarian BLT", "Fakin' Bacon with lettuce & tomato", true, 2.99));
        // AlternateDinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato", false, 2.99));
        // AlternateDinerMenu.add(new MenuItem("Soup of the day", "Soup with a side of potato salad", false, 3.29));


        MenuComponent CafeMenu = new Menu("Cafe", "Cafe Menu");
        CafeMenu.add(new MenuItem("Veggie Burger and Fries", "Veggie Burger on a whole wheat bun, lettuce, tomato and fries", true, 3.99));
        CafeMenu.add(new MenuItem("Soup of the day", "A cup of soup of the day with a side salad", false, 3.69));
        CafeMenu.add(new MenuItem("Burrito", "A large burrito, with pinto beans, salsa, and guacamole.", true, 4.29));

        MenuComponent PancakeMenu = new Menu("PancakeHouse", "Pancake House Menu");
        PancakeMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs", true, 2.99));
        PancakeMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs", false, 2.99));
        PancakeMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes with fresh blueberries", true, 3.49));


        MenuComponent combinedMenu = new Menu("Combined Menu", "Combined Menu of all Menu items");
        combinedMenu.add(PancakeMenu);
        combinedMenu.add(CafeMenu);
        combinedMenu.add(DinerMenu);

        //combinedMenu.print();
        //System.out.println("___________________________  Vegetarian Only Menu _____________________");
        //printVegetarian(combinedMenu);
        printVegetarianIterator(combinedMenu);

        // System.out.println("--- Combined MENU ---");
        // while(menu.hasNext()){
        //     MenuItem item = (MenuItem) menu.next();
        //     printItem(item);
        // }

        // System.out.println("___ ALternate Diner Menu_____");
        // AlternativeDinerMenuIterator altDiner = new AlternativeDinerMenuIterator(diner.getMenuItems(), "Tuesday");
        // while(altDiner.hasNext()){
        //     MenuItem item = (MenuItem) altDiner.next();
        //     printItem(item);
        // }
    }

    public static void printVegetarian(MenuComponent menu){
        if(menu instanceof Menu){
            int size = ((Menu)menu).totalComponents();

            System.out.println("\n" + menu.getName());
            System.out.println(menu.getDescription());
            System.out.println("------------------------");

            for(int i = 0; i < size; i++){
                printVegetarian(menu.getChild(i));
            }
        }else if(menu instanceof MenuItem){
            if(menu.isVegetarian()){
                menu.print();
            }
        }
    }

    public static void printVegetarianIterator(MenuComponent menu){
        Iterator<MenuComponent> iterator = menu.createIterator();
        System.out.println("Vegetarian Menu");
        while(iterator.hasNext()){
            MenuComponent component = iterator.next();
            try{
                if(component.isVegetarian()){
                    component.print();
                }
            }catch(UnsupportedOperationException e){}
        }
    }

    public static void printItem(MenuItem item) {
        System.out.println(item.getName() + ", $" + item.getPrice() +
                " -- " + item.getDescription() +
                " (Veg: " + item.isVegetarian() + ")");
    }
}
