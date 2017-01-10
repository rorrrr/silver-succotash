import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person passengers;

  @Before 
  public void before() {
    bus = new Bus(23);
    passengers = new Person();
  }

  @Test
  public void hasName(){
    assertEquals(23, bus.getNumber()); 
  }

  @Test
  public void busStartsEmpty() {
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void addPassenger() {
    bus.add(passengers);
    assertEquals(1, bus.passengerCount());
  }

  @Test
  public void busHasCapacity() {
    for(int i = 0; i <20; i++) {
      bus.add(passengers);
    }
    assertEquals(10, bus.passengerCount());
  }

  @Test
  public void busCapacityIs10() {
    for(int i = 0; i<20; i++) {
      bus.add(passengers);
    }
    assertEquals(true, bus.isBusFull());
  }
}