import java.util.*;

class Coin {
  boolean flip() {
    Random rand = new Random();
    return rand.nextBoolean();
  }
}

class CoinFlipping {
  public static void main(String[] args) {
    Coin coin = new Coin();
    System.out.println(coin.flip());
    System.out.println(coin.flip());
    System.out.println(coin.flip());
  }
}
