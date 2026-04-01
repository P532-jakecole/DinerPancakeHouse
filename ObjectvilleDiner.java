public class ObjectvilleDiner {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public ObjectvilleDiner() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "Fakin' Bacon with lettuce & tomato", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato", false, 2.99);
        addItem("Soup of the day", "Soup with a side of potato salad", false, 3.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Menu is full!");
            return;
        }

        menuItems[numberOfItems] = new MenuItem(name, description, vegetarian, price);
        numberOfItems++;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
