import java.util.ArrayList;

public class ObjectvillePancakeHouse {
    private ArrayList<MenuItem> menuItems;

    public ObjectvillePancakeHouse() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes with fresh blueberries", true, 3.49);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}