public class Literals {
  public static void main(String[] args) {
    int i1 = 0x2f; // Hexadecimal (lowercase)
    System.out.println("i1: " + Long.toBinaryString(i1));
    int i2 = 0X2F; // Hexadecimal (uppercase)
    System.out.println("i2: " + Long.toBinaryString(i2));
    int i3 = 0177; // Octal (leading zero)
    System.out.println("i3: " + Long.toBinaryString(i3));
    char c = 0xffff; // max char hex value
    System.out.println("c: " + Long.toBinaryString(c));
    byte b = 0x7f; // max byte hex value
    System.out.println("b: " + Long.toBinaryString(b));
    short s = 0x7fff; // max short hex value
    System.out.println("s: " + Long.toBinaryString(s));
  }
}
