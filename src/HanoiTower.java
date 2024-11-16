public class HanoiTower {

  public static void main(String[] args) {
    towerOfHanoi(4, 'X', 'Y', 'Z');
  }

  private static void towerOfHanoi(int n, char from, char to, char aux) {
    if (n == 1) {
      System.out.printf("Moving disk %d from %s to %s rod\n", n, from, to);
    } else {
      towerOfHanoi(n - 1, from, aux, to);
      System.out.printf("Moving disk %d from %s to %s rod\n", n, from, to);
      towerOfHanoi(n - 1, aux, to, from);
    }
  }
}
