import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;
    Iterator<MenuComponent> iterator = null;

    public Menu(String name, String description){
        this.name  = name;
        this.description = description;
    }

    public int totalComponents(){
        return menuComponents.size();
    }


    public void add(MenuComponent menuComponent){
        this.menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i){
        return menuComponents.get(i);
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void print(){
       System.out.println("\n" + getName());
       System.out.println(getDescription());
       System.out.println("------------------------");

       for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    public Iterator<MenuComponent> createIterator(){
        if(iterator == null){
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }
}
