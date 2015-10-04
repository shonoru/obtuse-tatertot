class TestAutoboxing {
  public static void main(String[] args) {
    Boolean bo = true;
    boolean b = bo;

    System.out.println(b);

    Character ch = 'x';
    char c = ch;

    System.out.println(c);

    Byte by = 127;
    byte byby = by;

    System.out.println(byby);

    Short sh = 128;
    short shsh = sh;

    System.out.println(shsh);

    Integer intint = 129;
    int i = intint;

    System.out.println(i);

    Long lo = 130L;
    long l = lo;

    System.out.println(l);

    Float fl = 131f;
    float f = fl;

    System.out.println(f);

    Double dou = 132d;
    double d = dou;

    System.out.println(d);
  }
}
