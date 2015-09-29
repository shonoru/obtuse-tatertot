class StaticTest {
  static int i = 47;
}

class Incrementable {
  public static void main(String[] args) {
    System.out.println(StaticTest.i);

    increment();

    System.out.println(StaticTest.i);
  }

  static void increment() {
    StaticTest.i++;
  }
}
