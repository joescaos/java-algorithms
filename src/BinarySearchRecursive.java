import java.util.Arrays;

public class BinarySearchRecursive {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};

    System.out.println(binarySearch(arr, 14));
  }

  private static boolean binarySearch(int[] arr, int target) {
    if(arr.length == 0) {
      return false;
    } else {
      int midPoint = arr.length / 2;
      if (target == arr[midPoint]) {
        return true;
      } else {
        if (target < arr[midPoint]) {
          return binarySearch(Arrays.copyOfRange(arr, 0, midPoint), target);
        } else {
          return binarySearch(Arrays.copyOfRange(arr, midPoint + 1, arr.length), target);
        }
      }
    }
  }
}
