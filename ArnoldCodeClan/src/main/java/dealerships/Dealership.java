package dealerships;

import components.Manufacturer;
import customers.Customer;
import interfaces.IBuy;
import interfaces.ISell;
import vehicles.Vehicle;

import java.util.HashMap;

public class Dealership implements IBuy, ISell {

    private int till;

    private HashMap<String, Vehicle> vehicleStock;

    public Dealership(int till, HashMap<String, Vehicle> vehicleStock) {
        this.till = till;
        this.vehicleStock = vehicleStock;
    }

    public void addStock(Vehicle vehicle) {
        this.vehicleStock.put(vehicle.getRegistration(),vehicle);
    }

    public void removeStock(Vehicle vehicle){
        this.vehicleStock.remove(vehicle.getRegistration());
    }

    public HashMap<String, Vehicle> getStock() {
        return this.vehicleStock;
    }

    public int getTillValue() {
        return this.till;
    }

    private void setTill(int amount) {
        till += amount;
    }
    public void buy(Vehicle vehicle, int cost){
        if (getTillValue() > cost) {
            setTill(-cost);
            addStock(vehicle);
        }
    }

    public void sell(Vehicle vehicle, int price, Customer customer){
        removeStock(vehicle);
        setTill(price);
        customer.buy(vehicle, price);
    }
}
