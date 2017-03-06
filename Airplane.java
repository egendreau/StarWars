import java.util.*;

public class Airplane extends Vehicle {

  boolean on_ground;
  double cargo_level;
  double max_cargo_load;
  ArrayList<Cargo> cargo;


  public Airplane(String name, double max_cargo_load,
                  int max_num_passengers) {
    super(name, max_num_passengers);
    this.max_cargo_load = max_cargo_load;
    this.cargo_level = 0.0;
    on_ground = true;
    cargo = new ArrayList<Cargo>();
  }

  public void takeOff() {
    if (on_ground) {
      on_ground = false;
    } else {
      System.out.println("We're already up in the air!\n");
    }
  }

  public void travelTo(String destination, double distance) {
    if (on_ground) {
      System.out.println("You must be in the air first!\n");
    }
    else if (distance > fuel_level) {
      System.out.println("Not enough fuel to get there from here!\n");
    } else {
      fuel_level -= distance;
      System.out.println("We got to " + destination + "!\n");
    }
  }

  public void pickupCargo(Cargo container) {
    if (cargo_level + container.getSize() > max_cargo_load) {
      System.out.println("There's not enough room!\n");
    } else {
      cargo.add(container);
      cargo_level += container.getSize();
      System.out.println("Your " + container.getName() + " is loaded onto the aircraft\n");
    }
  }

  public String toString() {
    String vehicle_stats = super.toString();
    return (vehicle_stats + "Cargo level: " + cargo_level + "\n");
  }
}
