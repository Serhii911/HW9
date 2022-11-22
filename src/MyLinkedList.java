import java.util.LinkedList;

public class MyLinkedList {

    LinkedList<Object> list;

    public void add(Object value) {
        list.addLast(value);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public void clear() {
        list.clear();
    }

    public int size() {
        return list.size();
    }

    public Object get(int index) {
        return list.get(index);
    }
}
