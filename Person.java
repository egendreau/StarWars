public class Person extends Character {

  String name;
  String species;
  int age;

  public Person(String name, int age) {
    super(name, age);
    this.name = name;
    this.age = age;
    this.species = "Human";
  }
}
