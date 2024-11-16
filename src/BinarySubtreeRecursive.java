import java.util.ArrayList;
import java.util.List;

public class BinarySubtreeRecursive {

  static class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
      this.value = value;
    }
  }

  public static void main(String[] args) {

    /*
     *        1
     *       /  \
     *     2      3
     *    /  \   /  \
     *  4     5 6    7
     */

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    /*
     *        4
     *       /  \
     *     5      6
     */

    Node root2 = new Node(4);
    root2.left = new Node(5);
    root2.right = new Node(6);

    System.out.println(checkSubTree(root, root.left));
  }

  static boolean checkSubTree(Node tree, Node sub) {
    if (sub == null) {
      return true;
    }

    if (tree == null) {
      return false;
    }

    List<Integer> first = new ArrayList<>();
    inOrder(tree, first);

    List<Integer> second = new ArrayList<>();
    inOrder(sub, second);

    if (!convertListToString(first).contains(convertListToString(second))) {
      return false;
    }

    first.clear();
    second.clear();

    preOrder(tree, first);
    preOrder(sub, second);

    return convertListToString(first).contains(convertListToString(second));
  }

  private static String convertListToString(List<Integer> list) {
    return list.toString().replace("[", "").replace("]", "").replace(",", "");
  }

  static void preOrder(Node root, List<Integer> list) {
    if (root == null) {
      return;
    }
    list.add(root.value);
    preOrder(root.left, list);
    preOrder(root.right, list);
  }

  static void inOrder(Node root, List<Integer> list) {
    if (root == null) {
      return;
    }

    inOrder(root.left, list);
    list.add(root.value);
    inOrder(root.right, list);
  }
}
