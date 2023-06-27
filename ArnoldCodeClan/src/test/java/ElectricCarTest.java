
import components.ElectricCarBattery;
import components.String;
import components.Tyres;
import components.VehicleEngine;
import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    private VehicleEngine engine;
    private Tyres tyres;
    private String manufacturer;
    private ElectricCarBattery battery;

    @Before
    public void setUp() {
        engine = new VehicleEngine(1.3);
        tyres = new Tyres("michelin");
        manufacturer = String.FORD;
        battery = new ElectricCarBattery(200);
        ElectricCar electricCar = new ElectricCar(engine, tyres, manufacturer, battery);
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
        assertEquals(String.FORD, this.manufacturer);
    }

    @Test
    public void hasBattery() {
        assertEquals(200, this.battery.getCharge()); }
}