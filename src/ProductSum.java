import java.util.List;

public class ProductSum {

  public static void main(String[] args) {
    List<Object> a1 = List.of(2, 3);
    List<Object> a2 = List.of(2, 4);
    List<Object> a3 = List.of(a1, 1);
    List<Object> array = List.of(1, 2, a1, 6, a3, 7);

    System.out.println(productOfSumArray(array, 1));
  }

  private static int productOfSumArray(List<Object> list, int depth) {
    int sum = 0;
    for (Object obj : list) {
      if (obj instanceof List) {
        sum += productOfSumArray((List) obj, depth + 1);
      } else {
        sum += (int) obj;
      }
    }

    return sum * depth;
  }
}
