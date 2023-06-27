
import components.ElectricCarBattery;
import components.Manufacturer;
import components.Tyres;
import components.VehicleEngine;
import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    private VehicleEngine engine;
    private Tyres tyres;
    private Manufacturer manufacturer;
    private ElectricCarBattery battery;
    private ElectricCar electricCar;

    @Before
    public void setUp() {
        engine = new VehicleEngine(1.3);
        tyres = new Tyres("michelin");
        manufacturer = Manufacturer.FORD;
        battery = new ElectricCarBattery(200);
        electricCar = new ElectricCar("W10",engine, tyres, manufacturer, battery);
    }

    @Test
    public void hasEngine() {
        assertEquals(1.3, this.engine.getCapacity(), 0.0);
    }

    @Test
    public void hasTyres() {
        assertEquals("michelin", this.tyres.getBrand());
    }

    @Test
    public void hasManufacturer() {
        assertEquals(Manufacturer.FORD, electricCar.getManufacturer());
    }

    @Test
    public void hasBattery() {
        assertEquals(200, this.battery.getCharge()); }
}