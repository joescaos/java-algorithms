import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPairThatSumsK {

  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7, 8};
    int k = 8;
    findPairsThatSumK(arr, k);
  }

  public static void findPairsThatSumK(int[] arr, int k) {;
    Map<Integer, Boolean> visited = new HashMap<>();
    for (int val : arr) {
      if (visited.containsKey(k - val)) {
        System.out.printf("%d + %d = %d\n", (k-val), val, k);
      } else {
        visited.put(val, true);
      }
    }
  }
}
