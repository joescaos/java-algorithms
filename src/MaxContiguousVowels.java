import java.util.List;

public class MaxContiguousVowels {

  public static void main(String[] args) {
    String word = "baeicoade";
    System.out.println(solution(word));
  }

  private static int solution(String word) {
    int maxVowels = 0;
    int currentSum = 0;
    char[] letters = word.toCharArray();

    for (char c : letters) {
      if (isVowel(c)) {
        currentSum += 1;
        maxVowels = Math.max(maxVowels, currentSum);
      } else {
        currentSum = 0;
      }
    }
    return maxVowels;
  }

  private static boolean isVowel(char c) {
    List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
    return vowels.contains(c);
  }
}
