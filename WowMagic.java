import lol.Dog;

class WowMagic {
  public static void main(String[] args) {
    Dog dog = new Dog("Mahoe");
    // Dog.sayHello() doesn't exist, but dog on the "new Dog" or constructed/instantiated dog does
    dog.sayHello();
    // Here we call the main method. Because it's a satic method
    // we don't need to create a "new Dog()"
    String[] lol = {};
    Dog.main(lol);
    dog.sayHello();
    Cat cat = new Cat("Stalin");
    cat.sayHello();
  }
}