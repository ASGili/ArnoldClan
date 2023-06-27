import components.ElectricCarBattery;
import components.Manufacturer;
import components.Tyres;
import components.VehicleEngine;
import customers.Customer;
import dealerships.Dealership;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    private ArrayList<Vehicle> vehicles;
    private Car car;
    private ElectricCar electricCar;
    private VehicleEngine engine;
    private Tyres tyres;
    private ElectricCarBattery battery;
    private Customer customer;
    private HashMap<String, Vehicle> vehicleStock;
    private Dealership dealership;

    @Before
    public void setUp(){
        vehicles = new ArrayList<>();
        battery = new ElectricCarBattery(400);
        engine = new VehicleEngine(1.6);
        tyres = new Tyres("redstone");
        car = new Car("W13",engine,tyres, Manufacturer.BMW);
        electricCar = new ElectricCar("G10",engine, tyres, Manufacturer.MAZDA, battery);
        vehicles.add(car);
        vehicles.add(electricCar);
        customer = new Customer(12000,vehicles);
        vehicleStock = new HashMap<>();
        dealership = new Dealership(50000, vehicleStock);
    }

    @Test
    public void hasVehicleStock(){
        dealership.addStock(car);
        assertEquals(1, dealership.getStock().size());
    }

    @Test
    public void hasTill(){
        assertEquals(50000, dealership.getTillValue());
    }
}
