/*
StarWars.java simulates the retrieval of cargo within the StarWars universe using aircraft.
*/

public class StarWars {

  public static void main(String[] args) {

    Character han = new Person("Han", 21);
    Character chewie = new Wookiee("Chewie", 35);

    Cargo map = new Cargo("Map to Luke", 10);

    Airplane falcon = new Airplane("Millenium Falcon", 50, 5);
    System.out.println(falcon.toString());

    falcon.addFuel(45);
    falcon.addPassenger(han);
    falcon.addPassenger(chewie);
    falcon.toggleEngine();

    System.out.println(falcon.toString());

    falcon.takeOff();
    falcon.travelTo("Jaku", 20);
    falcon.pickupCargo(map);

    System.out.println(falcon.toString());

    falcon.travelTo("Home", 20);
    falcon.toggleEngine();

    System.out.println(falcon.toString());
  }

}
