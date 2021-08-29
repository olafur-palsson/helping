public class Cat {
  String name;

  public Cat (String name) {
    this.name = name;
  }

  public void sayHello () {
    System.out.println("Meow. (Nametag says " + this.name + ")");
  }
}