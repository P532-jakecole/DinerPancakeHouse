public class AlternativeDinerMenuIterator implements Iterator{
    MenuItem[] items;
    boolean even;
    int position = 0;

    public AlternativeDinerMenuIterator(MenuItem[] items, String day){
        this.items = items;
        if(day == "Monday" || day == "Wednesday" || day == "Friday" || day == "Sunday"){
            even = true;
        }else{
            even = false;
        }
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        }else if(position % 2 == 0 && even){
            return true;
        }else if(position % 2 == 1 && !even){
            return true;
        }else{
            position++;
            return hasNext();
        }
    }

    @Override
    public Object next() {
        MenuItem item = items[position];
        position++;
        return item;

    }
    
}
