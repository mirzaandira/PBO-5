public class Animal {

  protected String name; // Properti protected
  private int age;     // Properti private

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void speak() {
    System.out.println("Suara Binatang");
  }
}

class Dog extends Animal {

  private String breed; // Properti private

  public Dog(String name, int age, String breed) {
    super(name, age); // Memanggil konstruktor Animal
    this.breed = breed;
  }

  @Override // Menandakan method ini meng-override method di kelas Animal
  public void speak() {
    System.out.println("Woof!");
  }

  public void bark() {
    System.out.println("The " + breed + " barks!");
  }
}

public class MainClass {

  public static void main(String[] args) {
    Dog dog = new Dog("Fido", 2, "Labrador");
    dog.speak();  // Akses publik ke method speak() yang di-override
    dog.bark();   // Akses publik ke method bark()
  }
}
