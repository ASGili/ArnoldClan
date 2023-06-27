package vehicles;

import components.ElectricCarBattery;
import components.Manufacturer;

import components.Tyres;
import components.VehicleEngine;

public class ElectricCar extends Vehicle {

    private ElectricCarBattery battery;
    public ElectricCar(String registrationNumber, VehicleEngine engine, Tyres tyres, Manufacturer manufacturer, ElectricCarBattery battery) {
        super(registrationNumber,engine, tyres, manufacturer);
        this.battery = battery;
    }
}
