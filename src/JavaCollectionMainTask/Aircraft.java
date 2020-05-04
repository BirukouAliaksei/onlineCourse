package JavaCollectionMainTask;

public abstract class Aircraft {
    private int flightRange;
    private String aircraftModel;
    private int fuelConsumption;
    private int peopleCapacity;
    private int carryingCapacity;


    public Aircraft(int peopleCapacity, int carryingCapacity, int flightRange, int fuelConsumption, String aircraftModel){
        this.peopleCapacity = peopleCapacity;
        this.carryingCapacity = carryingCapacity;
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
        this.aircraftModel = aircraftModel;
    }

    public int getPeopleCapacity(){
        return peopleCapacity;
    }

    public int getCarryingCapacity(){
        return carryingCapacity;
    }

    public int getFlightRange(){
        return flightRange;
    }

    public String getAircraftModel(){
        return aircraftModel;
    }

    public int getFuelConsumption(){
        return fuelConsumption;
    }

    public void setFlightRange(){
        this.flightRange = flightRange;
    }

    public void setAircraftModel(){
        this.aircraftModel = aircraftModel;
    }

    public void setFuelСonsumption(){
        this.fuelConsumption = fuelConsumption;
}

    public void setPeopleCapacity(){
        this.peopleCapacity = peopleCapacity;
    }

    public void setCarryingCapacity(){
        this.carryingCapacity= carryingCapacity;
    }

    public String toString() {
        return "Aircraft [aircraftPeople=" + getPeopleCapacity()
                + ", carryingCapacity=" + getCarryingCapacity() + ", flightRange="
                + getFlightRange() + ", aircraftModel=" + getAircraftModel() +
                ", fuelConsumption=" + getFuelConsumption() + "]";
    }

}
