package vehicles;

import components.Manufacturer;
import components.Tyres;
import components.VehicleEngine;

public class Car extends Vehicle {

    public Car(String registrationNumber, VehicleEngine engine, Tyres tyres, Manufacturer manufacturer) {
            super(registrationNumber, engine, tyres, manufacturer);
    }
}
