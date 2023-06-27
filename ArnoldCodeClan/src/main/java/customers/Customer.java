package customers;

import interfaces.IBuy;
import interfaces.ISell;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer implements IBuy {
    private int money;
    private ArrayList<Vehicle> vehicles;

    public Customer(int money, ArrayList<Vehicle> vehicles) {
        this.money = money;
        this.vehicles = vehicles;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public int getMoney() {
        return money;
    }

    public void buy(Vehicle vehicle, int cost){
        if (money > cost){
            vehicles.add(vehicle);
        }
    }

}
