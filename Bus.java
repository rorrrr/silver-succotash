class Bus {
  private int number;
  private Person[ ] passengers;

  public Bus(int number){
    this.number = number;
    this.passengers = new Person[10];
  }

  public int getNumber(){
    return this.number;
  }

  public int passengerCount() {
    int count = 0;
    for(Person passenger : passengers) {
      if(passenger != null) {
        count += 1;
      }
    }
    return count;
  }

  public void add(Person busgoer) {
    if (isBusFull()) return;

    int passengerCount = passengerCount();
    passengers[passengerCount] = busgoer;
  }

  public boolean isBusFull() {
    return passengerCount() == passengers.length;
  }

  public void dayEnd() {
    for(int i = 0; i < passengers.length; i++) {
      passengers[i] = null;
    }
  }
}