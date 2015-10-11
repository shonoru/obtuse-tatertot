class Dog {
  String name, says;
}

class BarkingDogs {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.name = "spot";
    dog1.says = "Ruff!";

    Dog dog2 = new Dog();
    dog2.name = "scruffy";
    dog2.says = "Wurf!";

    Dog spot = new Dog();
    spot.name = "spot";
    spot.says = "Ruff!";

    System.out.println(dog1.name + ": " + dog1.says);
    System.out.println(dog2.name + ": " + dog2.says);

    System.out.println(dog1.equals(spot));
    System.out.println(dog1 == spot);
    System.out.println(dog1.name == spot.name);
    System.out.println(dog1.says == spot.says);

    System.out.println(dog1.equals(dog2));
  }
}
