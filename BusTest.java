import static org.junit.Assert.assertEquals;
import org.junit.*;


// public class BearTest{
//   Bear bear;
//   Salmon dinner;

//   @Before 
//   public void before() {
//     bear = new Bear("Baloo");
//     dinner = new Salmon();
//   }
public class BusTest{
  Bus bus;
  PersonOn personOn;
  PersonOff personOff;

  @Before 
  public void before() {
    bus = new Bus(23);
    busStop = new BusStop("Street");
    personOn = new PersonOn();
    personOff = new PersonOff();
  }

  @Test
  public void hasNumber(){
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

  @Test
  public void kickEveryoneOffBus() {
    bus.add(passengers);
    bus.dayEnd();
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void hasName(){
    assertEquals("Street", busStop.getName()); 
  }

  @Test
  public void canMoveFromStopToBus(){
    assertEquals(0, busStop.passengerCount());
  }




}