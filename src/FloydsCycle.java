import java.util.LinkedList;

public class FloydsCycle {

  public static void main(String[] args) {

    Node o = new Node(1);
    Node t = new Node(2);
    Node th = new Node(3);
    Node f = new Node(4);
    Node fi = new Node(5);

    o.next = t;
    t.next = th;
    th.next = f;
    f.next = fi;
    fi.next = th;

    System.out.println(solution(o).value);
  }

  private static Node solution(Node head) {
    Node slow = head;
    Node fast = head;
    while (true) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        break;
      }
    }
    slow = head;
    while (slow != fast) {
      slow = slow.next;
      fast = fast.next;
    }
    return slow;
  }

  static class Node {
    int value;
    Node next;

    public Node(int value) {
      this.value = value;
    }
  }
}
