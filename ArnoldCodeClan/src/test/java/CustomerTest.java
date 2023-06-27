import components.ElectricCarBattery;
import components.Manufacturer;
import components.Tyres;
import components.VehicleEngine;
import customers.Customer;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private ArrayList<Vehicle> vehicles;
    private Car car;
    private ElectricCar electricCar;
    private VehicleEngine engine;
    private Tyres tyres;
    private ElectricCarBattery battery;
    private Customer customer;

    @Before
    public void setUp(){
        vehicles = new ArrayList<>();
        battery = new ElectricCarBattery(400);
        engine = new VehicleEngine(1.6);
        tyres = new Tyres("redstone");
        car = new Car("G10",engine,tyres, Manufacturer.BMW);
        electricCar = new ElectricCar("W10", engine, tyres, Manufacturer.MAZDA, battery);
        vehicles.add(car);
        vehicles.add(electricCar);
        customer = new Customer(1200,vehicles);
    }

    @Test
    public void canGetVehicles(){
        assertEquals(2, customer.getVehicles().size());
    }

    @Test
    public void canGetMoney(){
        assertEquals(1200, customer.getMoney());
    }
}
