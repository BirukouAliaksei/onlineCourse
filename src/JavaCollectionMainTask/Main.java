package JavaCollectionMainTask;

import java.util.Collections;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

    Aircraft boieng = new Boieng();
    Aircraft airbus = new Airbus();

    Airline airlineBirukou = new Airline("BirukouAirlines");
    airlineBirukou.addAircraft(boieng);
    airlineBirukou.addAircraft(airbus);
    System.out.println(airlineBirukou.getPeopleCapacity() + "all people capacity");
    System.out.println(airlineBirukou.getCarryingCapacity() + "all carrying capacity");
    System.out.println(airlineBirukou.getAircraftModel()+ "first aircraft model");
    System.out.println(airlineBirukou.getFlightRange() + " flight range");
    System.out.println(airlineBirukou.getFuelConsumption() + "all fuel consumption");

    System.out.println("Aircraft compare");
    airlineBirukou.sortPlanesByFlightRange();
    airlineBirukou.showAirlineAircrafts();

    System.out.println("Filter");
    airlineBirukou.filterByFuelConsumption(3000, 7000);

    }
}
