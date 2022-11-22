import java.util.Stack;

public class MyStack {

    Stack<Object> list = new Stack<>();

    public void push(Object value) {
        list.push(value);
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

    public Object peek() {
        return list.peek();
    }

    public Object pop() {
        return list.pop();
    }

}
