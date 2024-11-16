public class StringSubsequence {

  public static void main(String[] args) {
    System.out.println(getSubsequence("abc"));
  }

  private static String getSubsequence(String word) {
    String result = "";
    if (word.isEmpty()) {
      return "";
    }
    char first = word.charAt(0);
    String rest = getSubsequence(word.substring(1));

    for(String subSeq: rest.split(",", -1)) {
      result += "," + first + subSeq;
      result += "," + subSeq;
    }

    return result.substring(1);
  }
}
