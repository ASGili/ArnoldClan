package interfaces;

import customers.Customer;
import vehicles.Vehicle;

public interface ISell {
    public void sell(Vehicle vehicle, int price, Customer customer);
}
