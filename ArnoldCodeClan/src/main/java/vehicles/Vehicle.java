package vehicles;

import components.Manufacturer;
import components.Tyres;
import components.VehicleEngine;

public abstract class Vehicle {

    private VehicleEngine engine;
    private Tyres tyres;
    private Manufacturer manufacturer;
    private String registrationNumber;

    public Vehicle(String registrationNumber, VehicleEngine engine, Tyres tyres, Manufacturer manufacturer) {
        this.registrationNumber = registrationNumber;
        this.engine = engine;
        this.tyres = tyres;
        this.manufacturer = manufacturer;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public String getRegistration() {
        return registrationNumber;
    }
}
