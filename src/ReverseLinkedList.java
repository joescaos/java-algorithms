public class ReverseLinkedList {

  public static void main(String[] args) {

    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(4);
    Node e = new Node(5);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;

    LinkedList list = new LinkedList(a);

    printLinkedList(list);

    reverseLinkedList(list);

    System.out.println();

    printLinkedList(list);
  }

  static void printLinkedList(LinkedList list) {
      Node curr = list.head;
      while (curr != null) {
      System.out.printf("%d->", curr.value);
      curr = curr.next;
      }
  }

  static void reverseLinkedList(LinkedList list) {
      if (list.head == null) {
          return;
      }
      Node prev = null;
      Node curr = list.head;
      while (curr!= null) {
          Node next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;
      }
      list.head = prev;
  }

  static class LinkedList {
    Node head;

    LinkedList(Node head) {
      this.head = head;
    }
  }

  static class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }
  }
}
