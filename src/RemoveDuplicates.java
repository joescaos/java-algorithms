import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicates {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 3, 4, 4, 1, 5};
    System.out.println(Arrays.toString(removeDuplicates(arr)));
    System.out.println(removeDuplicates2(arr));
  }

  public static int[] removeDuplicates(int[] arr) {
    return Arrays.stream(arr).distinct().toArray();
  }

  public static List<Integer> removeDuplicates2(int[] arr) {
    Map<Integer, Boolean> visited = new HashMap<>();
    for (int val : arr) {
      visited.put(val, true);
    }
    return new ArrayList<>(visited.keySet());
  }
}
