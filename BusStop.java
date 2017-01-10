class BusStop {

  private String name;
  private Person[ ] waiters;
  private int bus;

  public BusStop(String name){
    this.name = name;
    this.waiters = new Person[5];
    // this.bus = new Bus(20);
  }

  public String getName(){
    return this.name;
  }

  public int passengerCount() {
    int count = 0;
    for(Person passenger : waiters) {
      if(passenger != null) {
        count += 1;
      }
    }
    return count;
  }

  // public int getOnBus(bus) {
  //   for(Person passenger : waiters) {
  //     if(passenger != null) {
  //       passengers
  //     }
  // }

}

