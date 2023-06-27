
import components.Manufacturer;
import components.Tyres;
import components.VehicleEngine;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private VehicleEngine engine;
    private Tyres tyres;
    private Manufacturer manufacturer;
    private Car car;

    @Before
    public void setUp(){
        engine = new VehicleEngine(1.3);
        tyres = new Tyres("michelin");
        manufacturer = Manufacturer.FORD;
        car = new Car("G10",engine, tyres, manufacturer);
    }

    @Test
    public void hasEngine(){
        assertEquals(1.3, this.engine.getCapacity(),0.0);
    }
    @Test
    public void hasTyres(){
        assertEquals("michelin", this.tyres.getBrand());
    }
    @Test
    public void hasManufacturer(){
        assertEquals(Manufacturer.FORD, car.getManufacturer());
    }


}
