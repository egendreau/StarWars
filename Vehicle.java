import java.util.*;

public class Vehicle {

  String name;
  int max_num_passengers;
  int num_passengers;
  Character[] passengers;
  double fuel_level;
  boolean engine_running;

  public Vehicle(String name, int max_num_passengers) {
    this.name = name;
    this.max_num_passengers = max_num_passengers;
    num_passengers = 0;
    engine_running = false;
    fuel_level = 0;

    passengers = new Character[max_num_passengers];
  }

  public void toggleEngine() {
    // if (!engine_running) {
    //   engine_running = true;
    // } else {
    //   engine_running = false
    // }
    engine_running = !engine_running;
  }

  public void addPassenger(Character passenger) {

    // Ensure vehicle is not full
    if (num_passengers >= max_num_passengers) {
      System.out.println("Too many passengers! You can't fit!");
    } else {
      // Place passenger into seat
      for (int i = 0; i < passengers.length; i++) {
        if (passengers[i] == null) {
          passengers[i] = passenger;
          break;
        }
      }

      num_passengers++;
    }
  }

  public void addFuel(double amount) {
    fuel_level += amount;
  }

  public String toString() {
    return ("\nVehicle: " + name + "\nNumber of Passengers: " + num_passengers + " out of " + max_num_passengers + "\nEngine Status: " + engine_running + "\nFuel Level: " + fuel_level + "\n");
  }
}
