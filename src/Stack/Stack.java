package Stack;

public class Stack<T> {

  private StackNode<T> top;

  public T pop() {
    if (this.top == null) return null;
    T item = top.data;
    top = top.next;
    return item;
  }

  public void push(T item) {
    StackNode<T> t = new StackNode<T>(item);
    t.next = top;
    top = t;
  }

  public T peek() {
    if (this.top == null) return null;
    return top.data;
  }

  public boolean isEmpty() {
    return top == null;
  }

  static class StackNode<T> {
    private T data;
    private StackNode<T> next;

    public StackNode(T data) {
      this.data = data;
    }
  }
}
