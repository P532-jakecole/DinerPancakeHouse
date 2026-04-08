import java.util.HashMap;

public class ObjectvilleCafe {
    private HashMap<String, MenuItem> menuItems = new HashMap<>();

    public ObjectvilleCafe() {
        addItem("Veggie Burger and Fries", "Veggie Burger on a whole wheat bun, lettuce, tomato and fries", true, 3.99);
        addItem("Soup of the day", "A cup of soup of the day with a side salad", false, 3.69);
        addItem("Burrito", "A large burrito, with pinto beans, salsa, and guacamole.", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public HashMap<String, MenuItem> getMenuItems() {
        return menuItems;
    }
}