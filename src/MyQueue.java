import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

    Queue<Object> list = new LinkedList<>();

    public void add(Object value) {
        list.add(value);
    }

    public void clear() {
        list.clear();
    }

    public int size() {
        return list.size();
    }

    public Object peek() {
        return list.peek();
    }

    public Object poll() {
        return list.poll();
    }
}
