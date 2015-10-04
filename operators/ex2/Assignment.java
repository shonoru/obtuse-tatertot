class Tank {
  float level;
}

class Assignment {
  public static void main(String[] args) {
    Tank t1 = new Tank();
    Tank t2 = new Tank();

    t1.level = 1f;
    t2.level = 2f;

    System.out.println(t1.level + " : " + t2.level);

    t1 = t2;

    System.out.println(t1.level + " : " + t2.level);

    t1.level = 3f;

    System.out.println(t1.level);
  }
}
