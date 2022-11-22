import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    Object[] array;

    public MyArrayList(Object[] array) {
        this.array = array;
    }

    public void add(Object value) {
        array[array.length - 1] = value;
    }

    public void remove(int index) {
        List<Object> list = new ArrayList<>(List.of(array));
        list.remove(index);
        array = list.toArray();
    }

    public void clear() {
        List<Object> list = new ArrayList<>(List.of(array));
        list.clear();
        array = list.toArray();
    }

    public int size() {
        return array.length;
    }

    public Object get(int index) {
        return array[index];
    }
}
