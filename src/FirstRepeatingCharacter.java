import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingCharacter {

    public static void main(String[] args){
        char[] arr = {'a', 'b', 'c', 'd', 'e'};

    System.out.println(firstRepeatingCharacter(arr));
  }

    public static char firstRepeatingCharacter(char[] arr) {
        Map<Character, Boolean> visited = new HashMap<>();

        for (char c: arr) {
            if (visited.containsKey(c)) {
                return c;
            } else {
                visited.put(c, true);
            }
        }
        return Character.MIN_VALUE;
    }
}
