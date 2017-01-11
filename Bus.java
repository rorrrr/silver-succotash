import java.util.*;

class Bus {
  private int number;
  private ArrayList<People> passengers;

  public Bus(int number){
    this.number = number;
    this.passengers = new ArrayList<People>();
  }

  public int getNumber(){
    return this.number;
  }

  public int passengerCount() {
    return passengers.count;
  }

  public void add(People busgoers) {
    passengers.add(busgoers);
  }

  public void dayEnd() {
    if (passengerCount() > 0 ) {
      return passengers.remove(0);
    }
    return null;
  }
}