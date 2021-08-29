// This is a package. And yes, a package has to have the same name as the folder.
package lol;


public class Dog {
  // The dog has a name, name is a string.
  public String name;
  // Read static as "class-wide" stuff. This is a class-wide
  // variable containing the number of dogs
  public static int numberOfDogs = 0;

  // This is the contstructor
  public Dog (String name) {
    this.name = name;
    // We increment the static variable
    this.numberOfDogs++;
  }

  // this is a method
  public void sayHello () {
    System.out.println("Hello, I'm a bitch called  " + this.name + ". One of " + this.numberOfDogs + ". Btw, Oli knows how to program lol.");
  }

  // You can access this from all the dogs when we instantiate them them (think "new")
  public static void PrintNumberOfDogs () {
    System.out.println(Dog.numberOfDogs);
  }

  public static void main(String[] args) {
    System.out.println("Dog.Main: Hello there, general Kenobi.");
    Dog dog = new Dog("Beeeesh");
    dog.sayHello();
    // Here we construct/instantiate an object of the "Dog" class into the variable "dog"
    Dog dog2 = new Dog("Trixie");
    // Calling a method
    dog2.sayHello();
    dog.sayHello();
    Dog dog3 = new Dog("Suckkkyyyy");
    Dog dog4 = new Dog("Bitchy");
    dog4.sayHello();
    dog3.sayHello();
    dog.sayHello();
  }
}