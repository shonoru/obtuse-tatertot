class AllTheColorsOfTheRainbow {
  static int anIntegerRepresentingColors;

  static void changeTheHueOfTheColor(int newHue) {
    anIntegerRepresentingColors = newHue;
    System.out.println(anIntegerRepresentingColors);
  }

  public static void main(String[] args) {
    changeTheHueOfTheColor(360);
  }
}
