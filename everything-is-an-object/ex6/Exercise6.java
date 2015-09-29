public class Exercise6 {
  public static void main(String[] args) {
    int result = storage("John Snow");

    System.out.println(result);
  }

  static int storage(String s) {
    return s.length() * 2;
  }
}
