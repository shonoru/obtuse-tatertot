class Tank {
  float level;
}

class PassObject {
  static void fullLevel(Tank t) {
    t.level = 5f;
  }
  public static void main(String[] args) {
    Tank t1 = new Tank();

    t1.level = 3f;
    System.out.println(t1.level);

    fullLevel(t1);

    System.out.println(t1.level);
  }
}
