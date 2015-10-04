class StaticObjectTest {
  public static void main(String[] args) {
    System.out.println("Main");

    StaticTest st1 = new StaticTest();
    StaticTest st2 = new StaticTest();
    StaticTest st3 = new StaticTest();

    System.out.println(st1.i);
    st1.increment();

    System.out.println(st2.i);
    st2.increment();

    System.out.println(st3.i);

    st3.increment();
    System.out.println(st1.i);
  }
}

class StaticTest {
  static int i = 47;

  public static void main(String[] args) {
    System.out.println(i);
  }

  void increment(){
    i++;
  }

}
