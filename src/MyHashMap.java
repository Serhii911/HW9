import java.util.HashMap;

public class MyHashMap {

    HashMap<Object, Object> map = new HashMap<>();

    public void put(Object key, Object value) {
        map.put(key, value);
    }

    public void remove(Object key) {
        map.remove(key);
    }

    public void clear() {
        map.clear();
    }
    public int size() {
        return map.size();
    }

    public Object get(Object key) {
        return map.get(key);
    }
}
